package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends ParentPage {

    @FindBy(xpath = ".//input[@id='username']")
    WebElement emailInput;

    @FindBy(xpath = ".//input[@id='password']")
    WebElement passwordInput;

    @FindBy(xpath = ".//input[@id='login']")
    WebElement loginButton;

    @FindBy(xpath = ".//a[@href='/profile']")
    WebElement profileLink;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    // === CLICK ELEMENT ===

    public void open() {
        try {
            open("http://23076.gollos.com/login");
        } catch (Exception e) {
            logger.error("Can not open registration page");
            Assert.fail("Can not open registration page");
        }
    }

    /**
     * Method to click on Login button in login form
     */
    public void clickLoginButton() {
        try {
            actionsWithWebElements.clickElement(loginButton);
        } catch (Exception e) {
            logger.error("Can not click on element");
            Assert.fail("Can not click on element");
        }
    }

    // === ENTER VALUE INTO INPUT ===

    /**
     * Method to enter email in login form
     *
     * @param email
     */
    public void enterEmail(String email) {
        try {
            actionsWithWebElements.enterText(emailInput, email);
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
            actionsWithWebElements.enterText(passwordInput, pass);
        } catch (Exception e) {
            logger.error("Can not enter text");
            Assert.fail("Can not enter text");
        }
    }

    // === ELEMENT IS DISPLAYED ===

    public boolean myCabinetLinkIsDisplayed() {
        try {
            actionsWithWebElements.isElementPresent(profileLink);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // === ACTIONS WITH VALUES ===

    /**
     * Method to enter email of valid user in login form
     */
    public void enterValidEmail() {
        try {
            actionsWithWebElements.enterText(emailInput, "qa.gannenko@gmail.com");
        } catch (Exception e) {
            logger.error("Can not enter text");
            Assert.fail("Can not enter text");
        }
    }

    public void logUser() {
        try {
            open();
            enterEmail("qa.gannenko@gmail.com");
            enterPassword("gannenko");
            clickLoginButton();
        } catch (Exception e) {
            logger.error("Can not log in");
            Assert.fail("Can not log in");
        }
    }

}