package libs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;

public class ActionsWithWebElements {
    private WebDriver driver;
    private Logger logger;

    public ActionsWithWebElements(WebDriver driver) {
        this.driver = driver;
        logger = Logger.getLogger(getClass());
    }

    public void enterText(String xpath, String text) {
        try {
            driver.findElement(By.xpath(xpath)).clear();
            driver.findElement(By.xpath(xpath)).sendKeys(text);
        } catch (Exception e) {
            logger.error("Can not enter text");
            Assert.fail("Can not enter text");
        }
    }

    /**
     * Method to locate main window and
     * to click on element in pop up window
     *
     * @param mainWindowsElementXpath
     * @param subWindowElementXpath
     */
    public void clickElementInPopUp(String mainWindowsElementXpath, String subWindowElementXpath) {
        try {
            String mainWindowHandle = driver.getWindowHandle();
            clickElement(mainWindowsElementXpath);
            Set s = driver.getWindowHandles();
            Iterator ite = s.iterator();
            while (ite.hasNext()) {
                String popupHandle = ite.next().toString();
                if (!popupHandle.contains(mainWindowHandle)) {
                    driver.switchTo().window(popupHandle);
                }
            }
            clickElement(subWindowElementXpath);
        } catch (Exception e) {
            logger.error("Can not work with pop up window");
            Assert.fail("Can not work with pop up window");
        }
    }

    public void clickHiddenDropDownElement(String xpath) {
        WebElement hiddenWebElement = driver.findElement(By.xpath(xpath));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", hiddenWebElement);
    }

    public void clickElement(String xpath) {
        try {
            driver.findElement(By.xpath(xpath)).click();
        } catch (Exception e) {
            logger.error("Can not click on element");
            Assert.fail("Can not click on element");
        }
    }

    /**
     * Method to click on first element in specific section
     */
    public void clickIndexItemInSection() {
        try {
            clickElement(".//section[@id='category']/article[2]//img");
        } catch (Exception e) {
            logger.error("First item is not available");
            Assert.fail("First item is not available");
        }
    }

    public void open(String url) {
        try {
            driver.get(url);
        } catch (Exception e) {
            logger.error("Can not open page");
            Assert.fail("Can not open page");
        }
    }

    public boolean elementIsDisplayed(String xpath) {
        try {
            driver.findElement(By.xpath(xpath));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Method checked is element present on page
     *
     * @param xpath
     * @return
     */
    public boolean isElementPresent(String xpath) {
        try {
            WebElement webElement = driver.findElement(By.xpath(xpath));
            return webElement.isDisplayed() && webElement.isEnabled();
        } catch (Exception e) {
            return false;
        }
    }

//    /**
//     * Method to click on hidden sub menu element
//     *
//     * @param mainMenuButtonXpath
//     * @param subMenuButtonXpath
//     */
//    public void clickHiddenSubMenuButton(WebElement mainMenuButtonXpath, WebElement subMenuButtonXpath) {
//        try {
//            Actions builder = new Actions(driver);
//            builder.moveToElement(mainMenuButtonXpath).build().perform();
//            builder.moveToElement(subMenuButtonXpath).build().perform();
//            subMenuButtonXpath.click();
//        } catch (Exception e) {
//            logger.error("Can not click on hidden sub menu element");
//            Assert.fail("Can not click on hidden sub menu element");
//        }
//    }

}