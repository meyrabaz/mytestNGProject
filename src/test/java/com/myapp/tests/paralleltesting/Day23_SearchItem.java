package com.myapp.tests.paralleltesting;
import com.myapp.utilities.WaitUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.time.Duration;
public class Day23_SearchItem {
    @Test
    public void googleSearch(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://www.google.com");
        WaitUtils.waitFor(2);
        try {
            driver.findElement(By.xpath("(//*[@class='QS5gu sy4vM'])[2]")).click();
        } catch (Exception e) {
        }
        System.out.println("Google Title : "+driver.getTitle());
        driver.findElement(By.name("q")).sendKeys("porcelain teapot"+ Keys.ENTER);
        driver.quit();
    }
    @Test
    public void ebaySearch(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://www.ebay.com");
        WaitUtils.waitFor(2);
        System.out.println("Resort line Title : "+driver.getTitle());
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("porcelain teapot"+Keys.ENTER);
        driver.quit();
    }
    @Test
    public void amazonSearch(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://www.amazon.com");
        WaitUtils.waitFor(2);
        System.out.println("Amazon Title : "+driver.getTitle());
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("porcelain teapot"+ Keys.ENTER);
        driver.quit();
    }
}
