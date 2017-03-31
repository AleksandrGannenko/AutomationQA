package libs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.Set;

public class ActionsWithWebElements {
    private WebDriver driver;
    private Logger logger;

    public ActionsWithWebElements(WebDriver driver) {
        this.driver = driver;
        logger = Logger.getLogger(getClass());
    }

    /**
     * Method to enter text into input using WebElement
     *
     * @param element
     * @param text
     */
    public void enterText(WebElement element, String text) {
        try {
            element.clear();
            element.sendKeys(text);
        } catch (Exception e) {
            logger.error("Can not enter text");
            Assert.fail("Can not enter text");
        }
    }

    /**
     * Method to click element using WebElement
     *
     * @param element
     */
    public void clickElement(WebElement element) {
        try {
            element.click();
        } catch (Exception e) {
            logger.error("Can not click on element");
            Assert.fail("Can not click on element");
        }
    }

    /**
     * Method to locate main window and
     * to click on subElement in pop up window using WebElement
     *
     * @param element
     */
    public void switchToPopUp(WebElement element) {
        try {
            String mainWindowHandle = driver.getWindowHandle();
            element.click();
            Set s = driver.getWindowHandles();
            Iterator ite = s.iterator();
            while (ite.hasNext()) {
                String popupHandle = ite.next().toString();
                if (!popupHandle.contains(mainWindowHandle)) {
                    driver.switchTo().window(popupHandle);
                }
            }
//            subElement.click();
        } catch (Exception e) {
            logger.error("Can not work with pop up window");
            Assert.fail("Can not work with pop up window");
        }
    }

    /**
     * Method to click on hidden element in drop down (for ex.)
     * using WebElement
     *
     * @param element
     */
    public void clickHiddenDropDownElement(WebElement element) {
        try {
            WebElement hiddenWebElement = element;
            ((JavascriptExecutor) driver).executeScript("arguments[0].click()", hiddenWebElement);
        } catch (Exception e) {
            logger.error("Can not work with hidden element");
            Assert.fail("Can not work with hidden element");
        }
    }

    /**
     * Method checked is element present on page
     *
     * @param element
     * @return
     */
    public boolean isElementPresent(WebElement element) {
        try {
            return element.isDisplayed() && element.isEnabled();
        } catch (Exception e) {
            return false;
        }
    }

}