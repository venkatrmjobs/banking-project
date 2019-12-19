package venkata.tests;

import commons.Init;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class testing {
private WebDriver webDriver;
    @Test
    public void launchBrowser (){
        Init i = new Init(webDriver);
        i.openBrowser("chrome");
    }

}
