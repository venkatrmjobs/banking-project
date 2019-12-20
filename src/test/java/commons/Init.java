package commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

public class Init {
    private static WebDriver webDriver;
//    public static Logger logger = LoggerFactory.getLogger(Init.class);

    public Init (){}
    public Init (WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public static Init getDriverInstance(WebDriver webDriver){
        return PageFactory.initElements(webDriver, Init.class);
    }

    /**
     * this function launching Browser
     * @param browserType
     */
    public static WebDriver initiateDriver (String browserType){
        switch (browserType){
            case "chrome":
                ChromeOptions options = new ChromeOptions();
                options.addArguments("start-maximized");
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
                webDriver = new ChromeDriver(options);
//                logger.info ("launching " + browserType + " browser");
                break;
            case "ie":

            case "firefox" :
        }
        return webDriver;
    }

    public void loadPage(String url){
        this.webDriver.get("https://www.chase.com/");
    }
}
