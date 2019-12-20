package commons;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class WebTest extends Init {
    public static WebDriver webDriver;
    private Init init;

    @Parameters({"browserType"})
    @BeforeClass
    public void launchBrowser(String browserType){
        init = Init.getDriverInstance(webDriver);
        webDriver = init.initiateDriver(browserType);
    }
}
