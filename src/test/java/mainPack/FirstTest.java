package mainPack;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FirstTest {
    WebDriver webDriver;

    @Test
    public void FirstTest() {
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        webDriver.get("http://v3.test.itpmgroup.com/login");

        webDriver.findElement(By.xpath(".//input[@name='_username']")).clear();
        webDriver.findElement(By.xpath(".//input[@name='_username']")).sendKeys("yy401@bigmir.net");

        webDriver.findElement(By.xpath(".//input[@id='password']")).clear();
        webDriver.findElement(By.xpath(".//input[@id='password']")).sendKeys("909090");

        webDriver.findElement(By.xpath(".//button[@class='btn btn-primary btn-block btn-flat']")).click();

        webDriver.findElement(By.xpath(".//a[@href='/dictionary/service']")).click();
        webDriver.findElement(By.xpath(".//a[@class='btn btn-info btn-sm']")).click();

        webDriver.findElement(By.xpath(".//input[@id='service_apparat_serviceChanges']")).clear();
        webDriver.findElement(By.xpath(".//input[@id='service_apparat_serviceChanges']"))
                .sendKeys("NewChange");

        webDriver.findElement(By.xpath(".//input[@id='service_apparat_serviceOperations']")).clear();
        webDriver.findElement(By.xpath(".//input[@id='service_apparat_serviceOperations']"))
                .sendKeys("NewOperation");

        webDriver.findElement(By.xpath(".//select[@id='service_apparat_serviceDate_date_day']//option[@value='13']")).click();
        webDriver.findElement(By.xpath(".//select[@id='service_apparat_serviceDate_date_month']//option[@value='6']")).click();
        webDriver.findElement(By.xpath(".//select[@id='service_apparat_serviceDate_date_month']//option[@value='6']")).click();
        webDriver.findElement(By.xpath(".//select[@id='service_apparat_serviceDate_time_hour']//option[@value='23']")).click();
        webDriver.findElement(By.xpath(".//select[@id='service_apparat_serviceDate_time_minute']//option[@value='59']")).click();
        webDriver.findElement(By.xpath(".//select[@id='service_apparat_apparat']//option[@value='47']")).click();
        webDriver.findElement(By.xpath(".//select[@id='service_apparat_worker']//option[@value='72']")).click();

        webDriver.findElement(By.xpath(".//button[@class='btn btn-info' and @name='add']")).click();

        webDriver.findElement(By.xpath(".//div[@class='box-body table-responsive no-padding']//..//td[contains(text(),'13.06.2012 23:59')]")).click();
        webDriver.findElement(By.xpath(".//button[@name='delete']")).click();

        //Assert.assertFalse(webDriver.findElement(By.xpath(".//div[@class='box-body table-responsive no-padding']//..//td[contains(text(),'13.06.2012 23:59')]")).isDisplayed());
        Assert.assertTrue(webDriver.findElement(By.xpath(".//h3")).isDisplayed());

        webDriver.quit();

    }

}
