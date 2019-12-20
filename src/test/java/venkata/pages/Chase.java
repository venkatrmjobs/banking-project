package venkata.pages;

import commons.Init;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Chase extends Init {
    private WebDriver webDriver;

    @FindBy (xpath = "//*[@id ='userId']/input[@name='userId']")
    private WebElement userID;

    @FindBy (xpath = "//*[@id = 'password']")
    private WebElement pwd;

    @FindBy (xpath = "//*[@id = 'signin-button']")
    private WebElement loginButton;

    public Chase(){}
    public Chase (WebDriver webDriver){
        super(webDriver);
        this.webDriver = webDriver;
    }

    public static Chase getDriverInstance(WebDriver webDriver){
        return PageFactory.initElements(webDriver, Chase.class);
    }

    /**
     *
     * @param loginID
     * @param loginPwd
     */
    public void login(String loginID, String loginPwd){
        userID.sendKeys(loginID);
        pwd.sendKeys(loginPwd);
        loginButton.click();
    }
}
