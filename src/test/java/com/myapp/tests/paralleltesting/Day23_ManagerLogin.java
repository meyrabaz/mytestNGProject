package com.myapp.tests.paralleltesting;
import com.myapp.utilities.WaitUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.time.Duration;
public class Day23_ManagerLogin {
    @Test
    public void customerLogin(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://www.bluerentalcars.com/login");
        driver.findElement(By.id("formBasicEmail")).sendKeys("customer@bluerentalcars.com");
        WaitUtils.waitFor(2);
        driver.findElement(By.id("formBasicPassword")).sendKeys("12345");
        WaitUtils.waitFor(2);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.close();
    }
}
