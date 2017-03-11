package tests23076;

import org.junit.Test;
import parentTest.ParentTest;

public class RegistrationTest extends ParentTest {
    public RegistrationTest(String browser) {
        super(browser);
    }

    @Test
    public void isRegistrationPageOpened() {
        registrationPage.openRegistrationPage();

        checkAC("Registration page is not displayed", registrationPage.isRegistrationPageDisplayed(), true);
    }

    @Test
    public void isEmailRequiredErrorDisplayed() {
        registrationPage.openRegistrationPage();
        registrationPage.enterValidPasswordsValue();
        registrationPage.clickSendButton();

        checkAC("Error for required email field is not displayed", registrationPage.isEmailRequiredErrorDisplayed(), true);
    }

    @Test
    public void isEmailInUseErrorDisplayed() {
        registrationPage.openRegistrationPage();
        registrationPage.enterValidEmailRegisteredUser();
        registrationPage.enterValidPasswordsValue();

        checkAC("Error for email in use is not displayed", registrationPage.isEmailInUseErrorDisplayed(), true);
    }

    @Test
    public void isEmailTypeCorrectErrorDisplayed() {
        registrationPage.openRegistrationPage();
        registrationPage.enterEmail("gannenko.qa");
        registrationPage.enterValidPasswordsValue();
        registrationPage.clickSendButton();

        checkAC("Error of incorrect email type is not displayed", registrationPage.isEmailTypeCorrectErrorDisplayed(), true);
    }

    @Test
    public void isEmailFreeNotificationDisplayed() {
        registrationPage.openRegistrationPage();
        registrationPage.enterValidEmailNewUser();
        registrationPage.enterValidPasswordsValue();

        checkAC("Notification that email free is not displayed", registrationPage.isEmailFreeNotificationDisplayed(), true);
    }

    @Test
    public void isPasswordRequiredErrorDisplayed() {
        registrationPage.openRegistrationPage();
        registrationPage.enterValidEmailNewUser();
        registrationPage.enterConfirmPassword("909090");
        registrationPage.clickSendButton();

        checkAC("Error for required password input is not displayed", registrationPage.isPasswordRequiredErrorDisplayed(), true);
    }

    @Test
    public void isConfirmPasswordRequiredErrorDisplayed() {
        registrationPage.openRegistrationPage();
        registrationPage.enterValidEmailNewUser();
        registrationPage.enterPassword("909090");
        registrationPage.clickSendButton();

        checkAC("Error for confirm password is not displayed", registrationPage.isConfirmPasswordRequiredErrorDisplayed(), true);
    }

    @Test
    public void doPasswordsMismatch() {
        registrationPage.openRegistrationPage();
        registrationPage.enterValidEmailNewUser();
        registrationPage.enterPassword("909090");
        registrationPage.enterConfirmPassword("090909");
        registrationPage.clickSendButton();

        checkAC("Error if passwords do not mismatch is not displayed", registrationPage.doPasswordsMismatch(), true);
    }

}