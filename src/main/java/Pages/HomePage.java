package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    //Initialize web driver
    private WebDriver driver;
    private By forgotPasswordLink = By.linkText("Forgot Password");


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public ForgotPasswordPage clickForgotPassword(){
        driver.findElement(forgotPasswordLink).click();
        return new ForgotPasswordPage(driver);
    }

}

