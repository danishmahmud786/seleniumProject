package pages;

import browser.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static browser.Browser.getPropertyValue;

public class HomePage {
    @FindBy(id = "txtUsername") private WebElement userNameElement;
    @FindBy (id = "txtPassword") private WebElement passwoedElement;
    @FindBy( id = "btnLogin") private  WebElement loginButton;

    public void login (){
        userNameElement.sendKeys(Browser.getPropertyValue("userName"));
        passwoedElement.sendKeys(getPropertyValue("password"));
        loginButton.click();
    }

}
