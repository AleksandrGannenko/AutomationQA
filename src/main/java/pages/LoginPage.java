package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginPage extends ParentPage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void openLoginPage() {
        try {
            actionsWithWebElements.open("http://23076.gollos.com/login");
        } catch (Exception e) {
            logger.error("Can not open registration page");
            Assert.fail("Can not open registration page");
        }
    }

    /**
     * Method to enter email in login form
     * @param email
     */
    public void enterEmail(String email) {
        try {
            actionsWithWebElements.enterText(".//input[@id='username']", email);
        } catch (Exception e) {
            logger.error("Can not enter text");
            Assert.fail("Can not enter text");
        }
    }

    /**
     * Method to enter email of valid user in login form
     */
    public void enterValidEmail() {
        try {
            actionsWithWebElements.enterText(".//input[@id='username']", "qa.gannenko@gmail.com");
        } catch (Exception e) {
            logger.error("Can not enter text");
            Assert.fail("Can not enter text");
        }
    }

    /**
     * Method to enter password in login form
     *
     * @param pass
     */
    public void enterPassword(String pass) {
        try {
            actionsWithWebElements.enterText(".//input[@id='password']", pass);
        } catch (Exception e) {
            logger.error("Can not enter text");
            Assert.fail("Can not enter text");
        }
    }

    /**
     * Method to click on Login button in login form
     */
    public void clickLoginButton() {
        try {
            actionsWithWebElements.clickElement(".//input[@id='login']");
        } catch (Exception e) {
            logger.error("Can not click on element");
            Assert.fail("Can not click on element");
        }
    }

    public void logUser() {
        try {
            open("http://23076.gollos.com/login");
            enterEmail("qa.gannenko@gmail.com");
            enterPassword("gannenko");
            clickLoginButton();
        } catch (Exception e) {
            logger.error("Can not log in");
            Assert.fail("Can not log in");
        }
    }

    public boolean myCabinetLinkIsDisplayed() {
        try {
            actionsWithWebElements.isElementPresent(".//a[@href='/profile']");
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}