package webconnector.we;

import java.io.IOException;
import java.net.MalformedURLException;

import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class Main {

	public static void main(String[] args) throws FailingHttpStatusCodeException, MalformedURLException, IOException {
		WebClient wb = new WebClient();
		wb.getOptions().setThrowExceptionOnScriptError(false);
		//wb.getOptions().setThrowExceptionOnFailingStatusCode(false);
		HtmlPage page = wb.getPage("https://new.qq.com/omn/20190224/20190224A07JOF.html#p=1");
		//page.executeJavaScript(sourceCode)
		
		System.out.println(page.asXml());
	}
}
