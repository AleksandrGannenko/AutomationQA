package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GmailPage extends ParentPage{

    @FindBy(xpath = ".//*[@id=\':mu\']")
    WebElement receiverInput;

    @FindBy(xpath = ".//div[text()='НАПИСАТЬ']")
    WebElement writeLetter;

    public GmailPage(WebDriver driver) {
        super(driver);
    }

    public void clickWriteAndSwitchToPopUp() {
        actionsWithWebElements.switchToPopUp(writeLetter);
    }
}
