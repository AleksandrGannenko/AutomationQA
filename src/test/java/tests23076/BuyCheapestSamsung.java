package tests23076;

import org.junit.Test;
import parentTest.ParentTest;

/**
 * Created by papaCarlo on 16.03.2017.
 */
public class BuyCheapestSamsung extends ParentTest{
    public BuyCheapestSamsung(String browser) {
        super(browser);
    }

    @Test
    public void buyCheapestSamsung() {
        homePage.open();
        homePage.setCurrencyRUB();
        homePage.clickSamsungSection();
        itemPage.clickSortFirstCheap();
        itemPage.clickFirstItemInSection();
        itemPage.enterItemsQuantity("3");
        itemPage.clickBuyAndSwitchToPopUp();
        buyPopUpPage.clickGoToBasketLink();

    }

}