package gmail;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import parentTest.ParentTest;

import java.util.Iterator;
import java.util.Set;

public class GmailSendLetter extends ParentTest{
    public GmailSendLetter(String browser) {
        super(browser);
    }






    @Test
    public void sendGmailLetter() {
        driver.get("https://www.google.com.ua");
        driver.findElement(By.cssSelector(".gb_P")).click();
        driver.findElement(By.xpath(".//input[@id='Email']")).sendKeys("ag.gannenko");
        driver.findElement(By.xpath(".//input[@id='next']")).click();
//        driver.findElement(By.xpath(".//input[@id='skipChallenge']")).click();
//        driver.findElement(By.xpath(".//form[@action='/signin/challenge/pwd/1']")).click();

        driver.findElement(By.xpath(".//input[@id='password']")).sendKeys("***");
        driver.findElement(By.xpath(".//input[@id='submit']")).click();
        driver.findElement(By.xpath(".//a[contains(text(),'Почта')]")).click();
//        driver.findElement(By.xpath(".//div[contains(text(),'НАПИСАТЬ')]")).click();


        driver.findElement(By.xpath(".//div[contains(text(),'НАПИСАТЬ')]")).click();


//        driver.switchTo().frame("canvas_frame");

//        driver.findElement(By.xpath("//body")).sendKeys("Test Content");


        driver.findElement(By.xpath("//form[1]//textarea[1]")).sendKeys("rkrushanovskij@gmail.com");
        //enter email id where you need to send email

        driver.findElement(By.xpath("//div[@class='aoD az6']//input[@class='aoT']")).sendKeys("Test");
        //Enter subject

        driver.findElement(By.xpath(".//div[@class='Am Al editable LW-avf']")).sendKeys("Test2");
        //Enter message body

        driver.findElement(By.xpath(".//*[contains(text(),'Test')]")).click();


        driver.findElement(By.xpath(".//*[@id=':r1']")).click();
//        driver.findElement(By.xpath(".//*[@id=':r1']")).sendKeys("111");

        driver.findElement(By.xpath(".//*[@id=':ma']"));

//        driver.findElement(By.xpath(".//*[contains(text(),'Отправить')]")).click();

//        driver.findElement(By.xpath(".//textarea[@id=':u3']")).clear();
//        driver.findElement(By.xpath(".//textarea[@id=':u3']")).sendKeys("data");



    }
}
