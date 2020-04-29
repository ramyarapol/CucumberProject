package automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {

    WebDriverWait wait;

    @FindBy(name = "username" )
    private WebElement userNameInputField;

    @FindBy(name = "password" )
    private WebElement passwordInputField;

    @FindBy(xpath = "//input[@class='button']" )
    private WebElement loginButton;



    public void enterUserName() {
        userNameInputField.isDisplayed();
        userNameInputField.sendKeys("testerram");
    }

    public void enterPassword() {
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.isDisplayed();
        passwordInputField.sendKeys("password");
    }

    public void clickLoginButton(){
        loginButton.isEnabled();
        loginButton.click();
    }
}
