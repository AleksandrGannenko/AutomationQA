package tests23076;

import org.junit.Test;
import parentTest.ParentTest;

public class RegistrationTest extends ParentTest {
    public RegistrationTest(String browser) {
        super(browser);
    }

    @Test
    public void isRegistrationPageOpened() {
        registrationPage.open();

        checkAC("Registration page is not displayed", registrationPage.isRegistrationPageDisplayed(), true);
    }

    @Test
    public void isEmailRequiredErrorDisplayed() {
        registrationPage.open();
        registrationPage.enterValidPasswordsValue();
        registrationPage.clickRegisterButton();

        checkAC("Error for required email field is not displayed", registrationPage.isEmailRequiredErrorDisplayed(), true);
    }

    @Test
    public void isEmailInUseErrorDisplayed() {
        registrationPage.open();
        registrationPage.enterValidEmailRegisteredUser();
        registrationPage.enterValidPasswordsValue();

        checkAC("Error for email in use is not displayed", registrationPage.isEmailInUseErrorDisplayed(),
                true);
    }

    @Test
    public void isEmailTypeCorrectErrorDisplayed() {
        registrationPage.open();
        registrationPage.enterEmail("gannenko.qa");
        registrationPage.enterValidPasswordsValue();
        registrationPage.clickRegisterButton();

        checkAC("Error of incorrect email type is not displayed", registrationPage.isEmailTypeIncorrectErrorDisplayed(),
                true);
    }

    @Test
    public void isEmailFreeNotificationDisplayed() {
        registrationPage.open();
        registrationPage.enterValidEmailNewUser();
        registrationPage.enterValidPasswordsValue();

        checkAC("Notification that email free is not displayed", registrationPage.isEmailNotInUseNotificationDisplayed(),
                true);
    }

    @Test
    public void isPasswordRequiredErrorDisplayed() {
        registrationPage.open();
        registrationPage.enterValidEmailNewUser();
        registrationPage.enterConfirmPassword("909090");
        registrationPage.clickRegisterButton();

        checkAC("Error for required password input is not displayed", registrationPage.isPasswordRequiredErrorDisplayed(),
                true);
    }

    @Test
    public void isConfirmPasswordRequiredErrorDisplayed() {
        registrationPage.open();
        registrationPage.enterValidEmailNewUser();
        registrationPage.enterPassword("909090");
        registrationPage.clickRegisterButton();

        checkAC("Error for confirm password is not displayed", registrationPage.isConfirmPasswordRequiredErrorDisplayed(),
                true);
    }

    @Test
    public void doPasswordsMismatch() {
        registrationPage.open();
        registrationPage.enterValidEmailNewUser();
        registrationPage.enterPassword("909090");
        registrationPage.enterConfirmPassword("090909");
        registrationPage.clickRegisterButton();

        checkAC("Error if passwords do not mismatch is not displayed", registrationPage.doPasswordsMismatch(),
                true);
    }

}