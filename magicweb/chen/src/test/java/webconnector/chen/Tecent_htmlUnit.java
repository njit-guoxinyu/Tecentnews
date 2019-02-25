package webconnector.chen;

import java.io.IOException;
import java.net.MalformedURLException;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class Tecent_htmlUnit {

	public static void main(String[] args) throws FailingHttpStatusCodeException, MalformedURLException, IOException {
		 WebClient mWebClient = new WebClient(BrowserVersion.CHROME);//模拟浏览器
		HtmlPage page = mWebClient.getPage("https://news.qq.com/");
		System.out.println(page.asText());
		mWebClient.close();
	}
}
