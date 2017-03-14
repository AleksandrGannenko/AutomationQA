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
        iphonePage.clickSortFirstExpensive();
        iphonePage.clickFirstItemInSection();
        iphonePage.enterIphoneQuantity("5");
        buyPopUpPage.clickGoToCartButton();
        cartPage.clickCheckoutButton();

        //checkAC();
    }

}