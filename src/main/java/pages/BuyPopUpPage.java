package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class BuyPopUpPage extends ParentPage {
    public BuyPopUpPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Method to click on go to cart button
     * in buy item pop up window
     */
    public void clickGoToCartButton() {
        try {
            actionsWithWebElements.clickElementInPopUp(".//div[@class='qty']/..//a",
                    ".//div[@class='qty']/..//a");
        } catch (Exception e) {
            logger.error("Can not click on go to cart button");
            Assert.fail("Can not click on go to cart button");
        }
    }

}