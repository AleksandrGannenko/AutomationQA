package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class HomePage extends ParentPage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    /**
     * Method to click on log in link
     */
    public void clickLoginLink() {
        try {
            actionsWithWebElements.clickElement(".//a[@href='/login']");
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
            actionsWithWebElements.clickElement(".//a[@href='/register']");
        } catch (Exception e) {
            logger.error("Can not click on registration link");
            Assert.fail("Can not click on registration link");
        }
    }

    /**
     * Method to open home page
     */
    public void openHomePage() {
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
            actionsWithWebElements.clickElement(".//a[@href='http://23076.gollos.com/iphone']");
        } catch (Exception e){
            logger.error("Can not click on Iphone section link");
            Assert.fail("Can not click on Iphone section link");
        }
    }

    /**
     * Method to click on Samsung category
     */
    public void clickSamsungSection() {
        try {
            actionsWithWebElements.clickElement(".//a[@href='http://23076.gollos.com/samsung']");
        } catch (Exception e){
            logger.error("Can not click on Samsung section link");
            Assert.fail("Can not click on Samsung section link");
        }
    }

    /**
     * Method to click on Meizu category
     */
    public void clickMeizuSection() {
        try {
            actionsWithWebElements.clickElement(".//a[@href='http://23076.gollos.com/meizu']");
        } catch (Exception e){
            logger.error("Can not click on Meizu section link");
            Assert.fail("Can not click on Meizu section link");
        }
    }

    /**
     * Method to click on Xiaomi category
     */
    public void clickXiaomiSection() {
        try {
            actionsWithWebElements.clickElement(".//a[@href='http://23076.gollos.com/xiaomi']");
        } catch (Exception e){
            logger.error("Can not click on Xiaomi section link");
            Assert.fail("Can not click on Xiaomi section link");
        }
    }

}