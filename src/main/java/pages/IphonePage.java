package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class IphonePage extends ParentPage {
    public IphonePage(WebDriver driver) {
        super(driver);
    }

    public void enterIphoneQuantity(String quantity) {
        try {
            actionsWithWebElements.enterText(".//div[@class='qty']/input", quantity);
        } catch (Exception e) {
            logger.error("Can not enter quantity of phones");
            Assert.fail("Can not enter quantity of phones");
        }
    }

    public void clickBuyIphone() {
        try {
            actionsWithWebElements.clickElement(".//div[@class='qty']/..//a");
        } catch (Exception e) {
            logger.error("Can not click to buy iphone");
            Assert.fail("Can not click to buy iphone");
        }
    }

    public void clickFirstItemInSection() {
        try {
            actionsWithWebElements.clickElement(".//*[@id='category']/article[2]//img");
        } catch (Exception e) {
            logger.error("Can not click on first item");
            Assert.fail("Can not click on first item");
        }
    }

    /**
     * Method to sort items by price (low first)
     */
    public void sortFirstCheap() {
        try {
            actionsWithWebElements.clickHiddenDropDownElement(".//a[text()='цене (с меньшей)']");
        } catch (Exception e) {
            logger.error("Can not sort by cheap");
            Assert.fail("Can not sort by cheap");
        }
    }

    /**
     * Method to sort items by price (expensive first)
     */
    public void sortFirstExpensive() {
        try {
            actionsWithWebElements.clickHiddenDropDownElement(".//a[text()='цене (с большей)']");
        } catch (Exception e) {
            logger.error("Can not sort by expensive");
            Assert.fail("Can not sort by expensive");
        }
    }

    /**
     * Method to sort items by newly added
     */
    public void sortFirstNew() {
        try {
            actionsWithWebElements.clickHiddenDropDownElement(".//a[text()='новинки']");
        } catch (Exception e) {
            logger.error("Can not sort by new items");
            Assert.fail("Can not sort by new items");
        }
    }

    /**
     * Method to sort items by available
     */
    public void sortFirstAvailable() {
        try {
            actionsWithWebElements.clickHiddenDropDownElement(".//a[text()='наличию']");
        } catch (Exception e) {
            logger.error("Can not sort by available");
            Assert.fail("Can not sort by available");
        }
    }

}