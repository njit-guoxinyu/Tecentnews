package webconnector.we;

import java.io.FileOutputStream;
import java.util.LinkedList;

import cn.edu.hfut.dmic.webcollector.model.CrawlDatums;
import cn.edu.hfut.dmic.webcollector.plugin.rocks.BreadthCrawler;

public class Xinlang extends BreadthCrawler {
	 static LinkedList<String> l  = new LinkedList<String>();
		
	    public Xinlang(String crawlPath, boolean autoParse) {
	        super(crawlPath, autoParse);
	        /*start pages*/
	        this.addSeed("https://news.sina.com.cn/china/");
	       
	        //https://news.sina.com.cn/c/2019-02-23/doc-ihqfskcp7758128.shtml
	       // this.addRegex("https://news.sina.com.cn/*//[0-9]{4}-[0-9]{2}-[0-9]{2}//*");
	        /*do not fetch jpg|png|gif*/
	        //this.addRegex("-.*\\.(jpg|png|gif).*");
	        /*do not fetch url contains #*/
	        //this.addRegex("-.*#.*");

	        setThreads(50);
	        getConf().setTopN(100);

	        //enable resumable mode
	        //setResumable(true);
	    }
	   

	    public static void main(String[] args) throws Exception {
	        Xinlang crawler = new Xinlang("crawl", true);
	        /*start crawl with depth of 4*/
	        crawler.start(5);
	    }
		public void visit(cn.edu.hfut.dmic.webcollector.model.Page page, CrawlDatums next) {
			// TODO Auto-generated method stub
			 String url = page.url().toString();
			 //if(url.matches("https://news.sina.com.cn/*//[0-9]{4}-[0-9]{2}-[0-9]{2}//*"))
			 l.add(url);
			next.add(page.links());
			if(l.size()>=20)
			{
				WriteStringToFile5("C://url.txt");
				l.clear();
			}
			
		       
		        System.out.println(url);
		}
		public static void WriteStringToFile5(String filePath) {
	        try {
	            FileOutputStream fos = new FileOutputStream(filePath,true);
	            for(String re:l)
	            {
	            	fos.write((re+"/").getBytes());
	            }
	            fos.flush();
	            fos.close();
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	    }

		

	}
