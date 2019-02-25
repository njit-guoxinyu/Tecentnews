package webconnector.chen;



import org.jsoup.nodes.Document;

import cn.edu.hfut.dmic.webcollector.model.CrawlDatums;
import cn.edu.hfut.dmic.webcollector.model.Page;
import cn.edu.hfut.dmic.webcollector.plugin.berkeley.BreadthCrawler;

/**
 * Crawling news from github news
 *
 * @author hu
 */
public class Web extends BreadthCrawler {


	/**
     * @param crawlPath crawlPath is the path of the directory which maintains
     *                  information of this crawler
     * @param autoParse if autoParse is true,BreadthCrawler will auto extract
     *                  links which match regex rules from pag
     */
    public Web(String crawlPath, boolean autoParse) {
        super(crawlPath, autoParse);
        /*start pages*/
        this.addSeed("https://news.qq.com//");
       
   

//        /*fetch url like "https://blog.github.com/2018-07-13-graphql-for-octokit/" */
//        this.addRegex("https://blog.github.com/[0-9]{4}-[0-9]{2}-[0-9]{2}-[^/]+/");
//        /*do not fetch jpg|png|gif*/
//        //this.addRegex("-.*\\.(jpg|png|gif).*");
//        /*do not fetch url contains #*/
//        //this.addRegex("-.*#.*");
//
//        setThreads(50);
//        getConf().setTopN(100);
//
//        //enable resumable mode
//        //setResumable(true);
    }

    public void visit(Page page, CrawlDatums next) {
        String url = page.url();
        System.out.println("url是"+url);
        System.out.println(page.html());
        Document sc = page.doc();
        System.out.println(sc.wholeText());

    }

    public static void main(String[] args) throws Exception {
        Web crawler = new Web("crawl", true);
        /*start crawl with depth of 4*/
        crawler.start(4);
    }

}
