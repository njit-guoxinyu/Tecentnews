package phantom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
public class test {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    //    System.setProperty("webdriver.gecko.driver", "C:\\Program Files (x86)\\Mozilla Firefox\\geckodriver.exe");
        System.setProperty("phantomjs.binary.path", "C:\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
    //    WebDriver driver = new FirefoxDriver();
        WebDriver driver = new PhantomJSDriver();
        driver.get("http://www.baidu.com");
        System.out.println(driver.getCurrentUrl());
        
 
    }
 


