package commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Init {
    private WebDriver webDriver;

    public Init (WebDriver webDriver){
        this.webDriver = webDriver;
    }

    /**
     * this function launching Browser
     * @param browserType
     */
    public void openBrowser (String browserType){
        switch (browserType){
            case "chrome":
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
                webDriver = new ChromeDriver();
                break;
            case "ie":

            case "firefox" :
        }
    }

}
