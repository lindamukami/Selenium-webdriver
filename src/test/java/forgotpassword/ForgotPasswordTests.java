package forgotpassword;

import Base.BaseTests;
import Pages.ForgotPasswordPage;
import org.testng.annotations.Test;

public class ForgotPasswordTests extends BaseTests {
    @Test
    public void testSuccessfulForgotPassword(){

        //GIVEN the user clicks the forgot password link in homepage
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        //AND enters the email
        forgotPasswordPage.setEmailField("linda@gmail.com");
        //WHEN they click retrieve password button
        forgotPasswordPage.clickRetrieveButton();
        //AND email is valid and previously registered
        //Then they should get an email sent notification (feature missing)

    }
}
