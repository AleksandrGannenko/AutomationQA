package pages;

import libs.ActionsWithWebElements;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.Matchers.is;

public class ParentPage {
    WebDriver driver;
    Logger logger;
    ActionsWithWebElements actionsWithWebElements;


    public ParentPage(WebDriver driver) {
        this.driver = driver;
        logger = Logger.getLogger(getClass());
        actionsWithWebElements = new ActionsWithWebElements(driver);
        PageFactory.initElements(driver, this);
    }

    /**
     * Method to open web page with url
     *
     * @param url
     */
    public void open(String url) {
        try {
            driver.get(url);
        } catch (Exception e) {
            logger.error("Can not open: " + url);
            Assert.fail("Can not open: " + url);
        }
    }

    /**
     * Method to check that page with correct title is opened
     *
     * @param expectedTitle
     */
    public void checkTitle(String expectedTitle) {
        try {
            Assert.assertThat("Title not match", driver.getTitle(), is(expectedTitle));
        } catch (Exception e) {
            logger.error("Can not work with page");
            Assert.fail("Can not work with page");
        }
    }

    /**
     * Method to get title of the page
     *
     * @return
     */
    public String getTitle() {
        return driver.getTitle();
    }

    /**
     * Method to check that text is present on page
     *
     * @param element
     * @param expectedText
     */
    public void checkTextOnPage(WebElement element, String expectedText) {
        try {
            Assert.assertThat("Text is not displayed", element.getText(), is(expectedText));
        } catch (Exception e) {
            logger.error("Can not find text on page");
            Assert.fail("Can not find text on page");
        }
    }

}