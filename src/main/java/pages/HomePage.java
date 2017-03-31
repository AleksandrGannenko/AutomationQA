package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ParentPage {

    @FindBy(xpath = ".//a[@href='/login']")
    WebElement loginLink;

    @FindBy(xpath = ".//a[@href='/register']")
    WebElement registerLink;

    @FindBy(xpath = ".//a[@href='http://23076.gollos.com/iphone']")
    WebElement iphoneSectionLink;

    @FindBy(xpath = ".//a[@href='http://23076.gollos.com/samsung']")
    WebElement samsungSectionLink;

    @FindBy(xpath = ".//a[@href='http://23076.gollos.com/meizu']")
    WebElement meizuSectionLink;

    @FindBy(xpath = ".//a[@href='http://23076.gollos.com/xiaomi']")
    WebElement xiaomiSectionLink;

    @FindBy(xpath = ".//a[@title='UAH']")
    WebElement currencyUAH;

    @FindBy(xpath = ".//a[@title='USD']")
    WebElement currencyUSD;

    @FindBy(xpath = ".//a[@title='RUB']")
    WebElement currencyRUB;

    @FindBy(xpath = ".//a[@title='EUR']")
    WebElement currencyEUR;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    /**
     * Method to click on log in link
     */
    public void clickLoginLink() {
        try {
            actionsWithWebElements.clickElement(loginLink);
        } catch (Exception e) {
            logger.error("Can not click on log in link");
            Assert.fail("Can not click on log in link");
        }
    }

    /**
     * Method to click on register link
     */
    public void clickRegisterLink() {
        try {
            actionsWithWebElements.clickElement(registerLink);
        } catch (Exception e) {
            logger.error("Can not click on registration link");
            Assert.fail("Can not click on registration link");
        }
    }

    /**
     * Method to open home page
     */
    public void open() {
        try {
            open("http://23076.gollos.com/");
        } catch (Exception e) {
            logger.error("Can not open home page");
            Assert.fail("Can not open home page");
        }
    }

    /**
     * Method to click on Iphone category
     */
    public void clickIphoneSection() {
        try {
            actionsWithWebElements.clickElement(iphoneSectionLink);
        } catch (Exception e) {
            logger.error("Can not click on Iphone section link");
            Assert.fail("Can not click on Iphone section link");
        }
    }

    /**
     * Method to click on Samsung category
     */
    public void clickSamsungSection() {
        try {
            actionsWithWebElements.clickElement(samsungSectionLink);
        } catch (Exception e) {
            logger.error("Can not click on Samsung section link");
            Assert.fail("Can not click on Samsung section link");
        }
    }

    /**
     * Method to click on Meizu category
     */
    public void clickMeizuSection() {
        try {
            actionsWithWebElements.clickElement(meizuSectionLink);
        } catch (Exception e) {
            logger.error("Can not click on Meizu section link");
            Assert.fail("Can not click on Meizu section link");
        }
    }

    /**
     * Method to click on Xiaomi category
     */
    public void clickXiaomiSection() {
        try {
            actionsWithWebElements.clickElement(xiaomiSectionLink);
        } catch (Exception e) {
            logger.error("Can not click on Xiaomi section link");
            Assert.fail("Can not click on Xiaomi section link");
        }
    }

    public void setCurrencyUAH() {
        actionsWithWebElements.clickHiddenDropDownElement(currencyUAH);
    }

    public void setCurrencyUSD() {
        actionsWithWebElements.clickHiddenDropDownElement(currencyUSD);
    }

    public void setCurrencyEUR() {
        actionsWithWebElements.clickHiddenDropDownElement(currencyEUR);
    }

    public void setCurrencyRUB() {
        actionsWithWebElements.clickHiddenDropDownElement(currencyRUB);
    }

}