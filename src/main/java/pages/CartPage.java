package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends ParentPage {

    @FindBy(xpath = ".//a[@id='']")
    WebElement checkoutButton;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Method to click on checkout link in cart
     */
    public void clickCheckoutButton() {
        try {
            checkoutButton.click();
        } catch (Exception e) {
            logger.error("Can not click on checkout button");
            Assert.fail("Can not click on checkout button");
        }
    }

}