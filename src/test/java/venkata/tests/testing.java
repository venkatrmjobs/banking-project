package venkata.tests;

import commons.Init;
import commons.WebTest;
import org.omg.Dynamic.Parameter;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import venkata.pages.Chase;

public class testing  {
    private WebDriver webDriver;
    private Chase chase;


    @Test
    @Parameters({"browserType","url"})
    public void chaseLogin ( String browserType, String url){
        webDriver = Init.initiateDriver(browserType);
        chase = Chase.getDriverInstance(webDriver);
        chase.loadPage(url);

    }
}
