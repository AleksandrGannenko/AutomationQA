package mainPack;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public class CreateTestUser {
    WebDriver webDriver;

    @Test
    public void createTestUser() {
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        webDriver.get("http://developers.facebook.com");
        webDriver.findElement(By.xpath(".//a[contains(text(),'Log In')]")).click();

        webDriver.findElement(By.xpath(".//input[@id='email']")).clear();
        webDriver.findElement(By.xpath(".//input[@id='email']")).sendKeys("test");

        webDriver.findElement(By.xpath(".//input[@id='pass']")).clear();
        webDriver.findElement(By.xpath(".//input[@id='pass']")).sendKeys("test");

        webDriver.findElement(By.xpath(".//button[@id='loginbutton']")).click();

        webDriver.get("https://developers.facebook.com/apps/1779467435609829/roles/test-users/");
        webDriver.findElement(By.xpath(".//a[@ajaxify='/apps/async/test-users/create/dialog/?app_id=1779467435609829']")).click();

        try {
            Thread.sleep(1000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        webDriver.findElement(By.xpath(".//button[contains(text(),'Create Test User')]")).click();
        //webDriver.findElement(By.xpath(".//table[@id='u_0_x']/tbody/tr[2]/td[2]")).click();







    }
}
