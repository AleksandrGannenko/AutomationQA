package tests23076;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import parentTest.ParentTest;

public class BuyIphoneTest extends ParentTest{
    public BuyIphoneTest(String browser) {
        super(browser);
    }

    @Test
    public void buyExpensiveIphone() {
        homePage.openHomePage();
        homePage.clickIphoneSection();
        actionsWithWebElements.clickElement(".//*[@id='category']/article[2]//img");

        Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='productPrice']")).isDisplayed());
//        iphonePage.sortFirstExpensive();
//        actionsWithWebElements.clickIndexItemInSection();




    }

}
