package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends ParentPage {
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public void openRegistrationPage() {
        try {
            actionsWithWebElements.open("http://23076.gollos.com/register");
            checkTitle("AutomationTesting");
        } catch (Exception e) {
            logger.error("Can not open registration page");
            Assert.fail("Can not open registration page");
        }
    }

    public void enterEmail(String email) {
        try {
            actionsWithWebElements.enterText(".//input[@id='reg_username']", email);
        } catch (Exception e) {
            logger.error("Can not enter email");
            Assert.fail("Can not enter email");
        }
    }

    public void enterPassword(String pass) {
        try {
            actionsWithWebElements.enterText(".//input[@id='reg_pass1']", pass);
        } catch (Exception e) {
            logger.error("Can not enter password");
            Assert.fail("Can not enter password");
        }
    }

    public void repeatPassword(String repeatPass) {
        try {
            actionsWithWebElements.enterText(".//input[@id='reg_pass2']", repeatPass);
        } catch (Exception e) {
            logger.error("Can not repeat password");
            Assert.fail("Can not repeat password");
        }
    }

    public void clickSendButton() {
        try {
            actionsWithWebElements.clickElement(".//input[@id='register']");
        } catch (Exception e) {
            logger.error("Can not click on element");
            Assert.fail("Can not click on element");
        }
    }

    public void registerNewUser(String email, String pass, String repeatPass) {
        try {
            enterEmail("dcnuin@gmail.com");
            enterPassword("909090");
            repeatPassword("909090");
            clickSendButton();
        } catch (Exception e) {
            logger.error("Can not register new user");
            Assert.fail("Can not register new user");
        }
    }

    public boolean isSendButtonDisplayed() {
        try {
            actionsWithWebElements.elementIsDisplayed(".//input[@id='register']");
            return true;
        } catch (Exception e) {
            return false;
        }
    }


}
