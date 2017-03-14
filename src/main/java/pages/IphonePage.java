package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IphonePage extends ParentPage {

    @FindBy(xpath = ".//div[@class='qty']/..//a")
    WebElement buyItem;

    @FindBy(xpath = ".//div[@class='qty']/input")
    WebElement quantityOfItemsInput;

    @FindBy(xpath = ".//*[@id='category']/article[2]//img")
    WebElement firstItemInSection;

    @FindBy(xpath = ".//a[text()='цене (с меньшей)']")
    WebElement sortFirstCheapDropdown;

    @FindBy(xpath = ".//a[text()='цене (с большей)']")
    WebElement sortFirstExpensiveDropdown;

    @FindBy(xpath = ".//a[text()='новинки']")
    WebElement sortFirstNewDropdown;

    @FindBy(xpath = ".//a[text()='наличию']")
    WebElement sortFirstAvailableDropdown;

    public IphonePage(WebDriver driver) {
        super(driver);
    }

    public void enterIphoneQuantity(String quantity) {
        try {
            actionsWithWebElements.enterText(quantityOfItemsInput, quantity);
        } catch (Exception e) {
            logger.error("Can not enter quantity of phones");
            Assert.fail("Can not enter quantity of phones");
        }
    }

    public void clickBuyIphone() {
        try {
            actionsWithWebElements.clickElement(buyItem);
        } catch (Exception e) {
            logger.error("Can not click to buy iphone");
            Assert.fail("Can not click to buy iphone");
        }
    }

    public void clickFirstItemInSection() {
        try {
            actionsWithWebElements.clickElement(firstItemInSection);
        } catch (Exception e) {
            logger.error("Can not click on first item");
            Assert.fail("Can not click on first item");
        }
    }

    /**
     * Method to sort items by price (low first)
     */
    public void clickSortFirstCheap() {
        try {
            actionsWithWebElements.clickHiddenDropDownElement(sortFirstCheapDropdown);
        } catch (Exception e) {
            logger.error("Can not sort by cheap");
            Assert.fail("Can not sort by cheap");
        }
    }

    /**
     * Method to sort items by price (expensive first)
     */
    public void clickSortFirstExpensive() {
        try {
            actionsWithWebElements.clickHiddenDropDownElement(sortFirstExpensiveDropdown);
        } catch (Exception e) {
            logger.error("Can not sort by expensive");
            Assert.fail("Can not sort by expensive");
        }
    }

    /**
     * Method to sort items by newly added
     */
    public void clickSortFirstNew() {
        try {
            actionsWithWebElements.clickHiddenDropDownElement(sortFirstNewDropdown);
        } catch (Exception e) {
            logger.error("Can not sort by new items");
            Assert.fail("Can not sort by new items");
        }
    }

    /**
     * Method to sort items by available
     */
    public void clickSortFirstAvailable() {
        try {
            actionsWithWebElements.clickHiddenDropDownElement(sortFirstAvailableDropdown);
        } catch (Exception e) {
            logger.error("Can not sort by available");
            Assert.fail("Can not sort by available");
        }
    }

}