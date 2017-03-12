package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends ParentPage {
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    // === OPEN PAGE ===

    /**
     * Method to open registration page
     */
    public void openRegistrationPage() {
        try {
            actionsWithWebElements.open("http://23076.gollos.com/register");
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
     * Method to enter valid email of registered user into input
     */
    public void enterValidEmailRegisteredUser() {
        try {
            actionsWithWebElements.enterText(".//input[@id='reg_username']", "gannenko.qa@gmail.com");
        } catch (Exception e) {
            logger.error("Can not enter email");
            Assert.fail("Can not enter email");
        }
    }

    /**
     * Method to enter valid email of new user
     *
     * @param email
     */
    public void enterValidEmailNewUser() {
        try {
            actionsWithWebElements.enterText(".//input[@id='reg_username']", "gannenko.qa.test@gmail.com");
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

    /**
     * Method to enter password into input
     *
     * @param pass
     */
    public void enterPassword(String pass) {
        try {
            actionsWithWebElements.enterText(".//input[@id='reg_pass1']", pass);
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
            actionsWithWebElements.enterText(".//input[@id='reg_pass2']", confirmPass);
        } catch (Exception e) {
            logger.error("Can not repeat password");
            Assert.fail("Can not repeat password");
        }
    }

    // === CLICK ON ELEMENT ===

    /**
     * Method to click on send button
     */
    public void clickSendButton() {
        try {
            actionsWithWebElements.clickElement(".//input[@id='register']");
        } catch (Exception e) {
            logger.error("Can not click on element");
            Assert.fail("Can not click on element");
        }
    }

    // === ELEMENT IS DISPLAYED ===

    /**
     * Methos verifies that registration page is opened
     */
    public boolean isRegistrationPageDisplayed() {
        try {
            actionsWithWebElements.elementIsDisplayed(".//h1[text()='Регистрация']");
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // === ERROR/NOTIFICATION MESSAGES ===

    /**
     * Method to check that error for required email input is displayed
     */
    public boolean isEmailRequiredErrorDisplayed() {
        try {
            actionsWithWebElements.elementIsDisplayed(".//*[@id='reg_username-error' and text()='Это поле необходимо заполнить.']");
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
            actionsWithWebElements.elementIsDisplayed(".//*[@id='UserInUse' and text()='Занято']");
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Method to check whether email type is correct
     */
    public boolean isEmailTypeCorrectErrorDisplayed() {
        try {
            actionsWithWebElements.elementIsDisplayed(".//*[@id='reg_username-error' and text()='Пожалуйста, введите корректный адрес электронной почты.']");
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Method to check whether notification for free email is displayed
     */
    public boolean isEmailFreeNotificationDisplayed() {
        try {
            actionsWithWebElements.elementIsDisplayed(".//*[@id='UserIsFree' and text()='Свободно']");
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
            actionsWithWebElements.elementIsDisplayed(".//*[@id='reg_pass1-error'] and text()='Это поле необходимо заполнить.'");
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
            actionsWithWebElements.elementIsDisplayed(".//*[@id='reg_pass2-error'] and text()='Это поле необходимо заполнить.'");
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
            actionsWithWebElements.elementIsDisplayed(".//*[@id='reg_pass2-error' and text()='Пожалуйста, введите такое же значение ещё раз.']");
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}