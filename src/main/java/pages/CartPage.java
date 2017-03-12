package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CartPage extends ParentPage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Method to click on checkout link in cart
     */
    public void clickCheckoutButton() {
        try {
            actionsWithWebElements.clickElement(".//a[@id='']");
        } catch (Exception e) {
            logger.error("Can not click on checkout button");
            Assert.fail("Can not click on checkout button");
        }
    }

}