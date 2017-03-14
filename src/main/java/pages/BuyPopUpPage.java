package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuyPopUpPage extends ParentPage {

    @FindBy(xpath = ".//a[text()='Перейти в корзину']")
    WebElement goToBasketLink;

    @FindBy(xpath = ".//div[@class='qty']/..//a")
    WebElement buyItem;

    public BuyPopUpPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Method to click on go to cart button
     * in buy item pop up window
     */
    public void clickGoToCartButton() {
        try {
            actionsWithWebElements.clickElementInPopUp(buyItem, goToBasketLink);
        } catch (Exception e) {
            logger.error("Can not click on go to cart button");
            Assert.fail("Can not click on go to cart button");
        }
    }

}