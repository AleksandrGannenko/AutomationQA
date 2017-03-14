package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends ParentPage {

    @FindBy(xpath = ".//input[@id='reg_username']")
    WebElement emailInput;

    @FindBy(xpath = ".//input[@id='reg_pass1']")
    WebElement passwordInput;

    @FindBy(xpath = ".//input[@id='reg_pass2']")
    WebElement confirmPasswordInput;

    @FindBy(xpath = ".//h1[text()='Регистрация']")
    WebElement registrationPage;

    @FindBy(xpath = ".//input[@id='register']")
    WebElement registerButton;

    @FindBy(xpath = ".//*[@id='reg_username-error' and text()='Это поле необходимо заполнить.']")
    WebElement emailRequiredError;

    @FindBy(xpath = ".//*[@id='UserInUse' and text()='Занято']")
    WebElement emailInUseError;

    @FindBy(xpath = ".//*[@id='reg_username-error' and text()='Пожалуйста, введите корректный адрес электронной почты.']")
    WebElement emailTypeIncorrectError;

    @FindBy(xpath = ".//*[@id='UserIsFree' and text()='Свободно']")
    WebElement emailNotInUseNotification;

    @FindBy(xpath = ".//*[@id='reg_pass1-error'] and text()='Это поле необходимо заполнить.'")
    WebElement passwordRequiredError;

    @FindBy(xpath = ".//*[@id='reg_pass2-error'] and text()='Это поле необходимо заполнить.'")
    WebElement confirmPasswordRequiredError;

    @FindBy(xpath = ".//*[@id='reg_pass2-error' and text()='Пожалуйста, введите такое же значение ещё раз.']")
    WebElement passwordsDoNotMismatchError;


    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    // === OPEN PAGE ===

    /**
     * Method to open registration page
     */
    public void open() {
        try {
            open("http://23076.gollos.com/register");
            checkTitle("AutomationTesting");
            isRegistrationPageDisplayed();
        } catch (Exception e) {
            logger.error("Can not open registration page");
            Assert.fail("Can not open registration page");
        }
    }

    // === ENTER TEXT INTO INPUT ===

    /**
     * Method to enter email into input
     *
     * @param email
     */
    public void enterEmail(String email) {
        try {
            actionsWithWebElements.enterText(".//input[@id='reg_username']", email);
        } catch (Exception e) {
            logger.error("Can not enter email");
            Assert.fail("Can not enter email");
        }
    }

    /**
     * Method to enter password into input
     *
     * @param pass
     */
    public void enterPassword(String pass) {
        try {
            passwordInput.sendKeys(pass);
        } catch (Exception e) {
            logger.error("Can not enter password");
            Assert.fail("Can not enter password");
        }
    }

    /**
     * Method to enter confirm password into input
     *
     * @param confirmPass
     */
    public void enterConfirmPassword(String confirmPass) {
        try {
            confirmPasswordInput.sendKeys(confirmPass);
        } catch (Exception e) {
            logger.error("Can not repeat password");
            Assert.fail("Can not repeat password");
        }
    }

    /**
     * Method to enter valid email of registered user into input
     */
    public void enterValidEmailRegisteredUser() {
        try {
            actionsWithWebElements.enterText(emailInput, "gannenko.qa@gmail.com");
        } catch (Exception e) {
            logger.error("Can not enter email");
            Assert.fail("Can not enter email");
        }
    }

    /**
     * Method to enter valid email of new user
     */
    public void enterValidEmailNewUser() {
        try {
            actionsWithWebElements.enterText(emailInput, "gannenko.qa.test@gmail.com");
        } catch (Exception e) {
            logger.error("Can not enter email");
            Assert.fail("Can not enter email");
        }
    }

    /**
     * Method to enter both valid passwords
     */
    public void enterValidPasswordsValue() {
        try {
            enterPassword("909090");
            enterConfirmPassword("909090");
        } catch (Exception e) {
            logger.error("Can not enter passwords");
            Assert.fail("Can not enter passwords");
        }
    }

    // === CLICK ON ELEMENT ===

    /**
     * Method to click on send button
     */
    public void clickRegisterButton() {
        try {
            registerButton.click();
        } catch (Exception e) {
            logger.error("Can not click on element");
            Assert.fail("Can not click on element");
        }
    }

    // === ELEMENT IS DISPLAYED ===

    /**
     * Method verifies that registration page is opened
     */
    public boolean isRegistrationPageDisplayed() {
        try {
            actionsWithWebElements.isElementPresent(registrationPage);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // === ERROR/NOTIFICATION MESSAGE IS DISPLAYED ===

    /**
     * Method to check that error for required email input is displayed
     */
    public boolean isEmailRequiredErrorDisplayed() {
        try {
            actionsWithWebElements.isElementPresent(emailRequiredError);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Method to check whether error for email in use is displayed
     */
    public boolean isEmailInUseErrorDisplayed() {
        try {
            actionsWithWebElements.isElementPresent(emailInUseError);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Method to check whether email type is correct
     */
    public boolean isEmailTypeIncorrectErrorDisplayed() {
        try {
            actionsWithWebElements.isElementPresent(emailTypeIncorrectError);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Method to check whether notification for free email is displayed
     */
    public boolean isEmailNotInUseNotificationDisplayed() {
        try {
            actionsWithWebElements.isElementPresent(emailNotInUseNotification);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Method to check that error for required password input is displayed
     */
    public boolean isPasswordRequiredErrorDisplayed() {
        try {
            actionsWithWebElements.isElementPresent(passwordRequiredError);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Method to check that error for required confirm password input is displayed
     */
    public boolean isConfirmPasswordRequiredErrorDisplayed() {
        try {
            actionsWithWebElements.isElementPresent(confirmPasswordRequiredError);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Method to check whether password and confirm password are equal
     */
    public boolean doPasswordsMismatch() {
        try {
            actionsWithWebElements.isElementPresent(passwordsDoNotMismatchError);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}