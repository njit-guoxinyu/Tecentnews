import java.io.IOException;
import java.net.MalformedURLException;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlDivision;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class Main {

    public static void main(String[] args) throws FailingHttpStatusCodeException, MalformedURLException, IOException {
        // TODO Auto-generated method stub
        final WebClient mWebClient = new WebClient(BrowserVersion.CHROME);
        mWebClient.getOptions().setCssEnabled(false);
        mWebClient.getOptions().setJavaScriptEnabled(false);
        final HtmlPage mHtmlPage = mWebClient.getPage("http://www.yanyulin.info/");
        //从[烟雨林博客]上获取标签hed的内容
        HtmlDivision mdiv = (HtmlDivision)mHtmlPage.getElementById("hed");
        System.out.println(mdiv.asText());
        mWebClient.closeAllWindows();
    }

}