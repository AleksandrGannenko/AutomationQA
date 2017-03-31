package tests23076;

import org.junit.Test;
import parentTest.ParentTest;

public class BuyIphoneTest extends ParentTest {
    public BuyIphoneTest(String browser) {
        super(browser);
    }

    @Test
    public void buyExpensiveIphone() {
        homePage.open();
        homePage.clickIphoneSection();
        itemPage.clickSortFirstExpensive();
        itemPage.clickFirstItemInSection();
        itemPage.enterItemsQuantity("5");
        itemPage.clickBuyAndSwitchToPopUp();
        buyPopUpPage.clickGoToBasketLink();
    }

}