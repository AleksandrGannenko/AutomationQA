package logOn;

import org.junit.Test;
import parentTest.ParentTest;

public class NewTestTest extends ParentTest {
    public NewTestTest(String browser) {
        super(browser);
    }

    @Test
    public void validRegistration() {
        registrationPage.openRegistrationPage();
        checkAC("Element is not displayed", registrationPage.isSendButtonDisplayed(), true);
    }
}