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

    public void enterText(String xpath, String text) {
        try {
            driver.findElement(By.xpath(xpath)).clear();
            driver.findElement(By.xpath(xpath)).sendKeys(text);
        } catch (Exception e) {
            logger.error("Can not enter text");
            Assert.fail("Can not enter text");
        }
    }

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
     * Method to locate main window and
     * to click on element in pop up window
     *
     * @param mainWindowElementXpath
     * @param subWindowElementXpath
     */
    public void clickElementInPopUp(String mainWindowElementXpath, String subWindowElementXpath) {
        try {
            String mainWindowHandle = driver.getWindowHandle();
            clickElement(mainWindowElementXpath);
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

    /**
     * Method to locate main window and
     * to click on subElement in pop up window
     *
     * @param element
     * @param subElement
     */
    public void clickElementInPopUp(WebElement element, WebElement subElement) {
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
            subElement.click();
        } catch (Exception e) {
            logger.error("Can not work with pop up window");
            Assert.fail("Can not work with pop up window");
        }
    }

    /**
     * Method to click on hidden element in drop down (for ex.)
     *
     * @param xpath
     */
    public void clickHiddenDropDownElement(String xpath) {
        try {
            WebElement hiddenWebElement = driver.findElement(By.xpath(xpath));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click()", hiddenWebElement);
        } catch (Exception e) {
            logger.error("Can not work with hidden element");
            Assert.fail("Can not work with hidden element");
        }
    }

    /**
     * Method to click on hidden element in drop down (for ex.)
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

    public void clickElement(String xpath) {
        try {
            driver.findElement(By.xpath(xpath)).click();
        } catch (Exception e) {
            logger.error("Can not click on element");
            Assert.fail("Can not click on element");
        }
    }

//    /**
//     * Method to click on first element in specific section
//     */
//    public void clickIndexItemInSection() {
//        try {
//            clickElement(".//section[@id='category']/article[2]//img");
//        } catch (Exception e) {
//            logger.error("First item is not available");
//            Assert.fail("First item is not available");
//        }
//    }

    public void open(String url) {
        try {
            driver.get(url);
        } catch (Exception e) {
            logger.error("Can not open page");
            Assert.fail("Can not open page");
        }
    }

//    public boolean elementIsDisplayed(String xpath) {
//        try {
//            driver.findElement(By.xpath(xpath));
//            return true;
//        } catch (Exception e) {
//            return false;
//        }
//    }

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