package libs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

public class ActionsWithWebElements {
    private WebDriver driver;
    private Logger logger;

    public ActionsWithWebElements(WebDriver driver) {
        this.driver = driver;
        logger = Logger.getLogger(getClass());
    }

    public void enterText(String xpath, String text) {
        try {
            driver.findElement(By.xpath(xpath)).sendKeys(text);
        } catch (Exception e) {
            logger.error("Can not enter text");
            Assert.fail("Can not enter text");
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

}