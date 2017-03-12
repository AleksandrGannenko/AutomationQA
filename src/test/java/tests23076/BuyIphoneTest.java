package tests23076;

import org.junit.Test;
import parentTest.ParentTest;

public class BuyIphoneTest extends ParentTest {
    public BuyIphoneTest(String browser) {
        super(browser);
    }

    @Test
    public void buyExpensiveIphone() {
        homePage.openHomePage();
        homePage.clickIphoneSection();
        iphonePage.sortFirstExpensive();
        //        iphonePage.sortFirstExpensive();
        iphonePage.clickFirstItemInSection();
        iphonePage.enterIphoneQuantity("5");
        actionsWithWebElements.clickElementInPopUp
                (".//div[@class='qty']/..//a", ".//div[@class='qty']/..//a");
        cartPage.clickCheckoutButton();

        //checkAC();
    }

}