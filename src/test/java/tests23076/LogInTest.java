package tests23076;

import org.junit.Test;
import parentTest.ParentTest;

public class LogInTest extends ParentTest {
    public LogInTest(String browser) {
        super(browser);
    }

    @Test
    public void validLogInUser() {
        loginPage.logUser();

        checkAC("User is not able to log in", loginPage.myCabinetLinkIsDisplayed(), true);
    }

}