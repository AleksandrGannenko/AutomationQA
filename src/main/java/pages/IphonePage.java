package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class IphonePage extends ParentPage {
    public IphonePage(WebDriver driver) {
        super(driver);
    }

    /**
     * Method to sort items by price (low first)
     */
    public void sortFirstCheap() {
        try {
            actionsWithWebElements.clickElement(".//a[text()='цене (с меньшей)']");
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
            actionsWithWebElements.clickElement(".//a[@href='/iphone?sort=priced']");
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
            actionsWithWebElements.clickElement(".//a[text()='новинки']");
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
            actionsWithWebElements.clickElement(".//a[text()='наличию']");
        } catch (Exception e) {
            logger.error("Can not sort by available");
            Assert.fail("Can not sort by available");
        }
    }

}