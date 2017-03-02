package logOn;

import org.junit.Test;
import org.openqa.selenium.By;
import parentTest.ParentTest;

/**
 * Created by papaCarlo on 02.03.2017.
 */
public class LogInWithInvalidPassword extends ParentTest {
    public LogInWithInvalidPassword(String browser) {
        super(browser);
    }

    @Test
    public void validLogOn() {
        driver.get("http://v3.test.itpmgroup.com");

        driver.findElement(By.name("_username")).clear();
        driver.findElement(By.name("_username")).sendKeys("Student");

        driver.findElement(By.name("_password")).clear();
        driver.findElement(By.id("password")).sendKeys("90909");

        driver.findElement(By.tagName("button")).click();

        checkAC("Avatar not present ", driver.findElement(By.xpath(".//div[@class='pull-left image']//img[@class='img-circle']"))
                .isDisplayed(), true);
    }

}
