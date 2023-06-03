package com.myapp.tests.topics;
import com.myapp.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Day18_FirstDriverTest {
    @Test
    public void firstDriverTest(){
//        Go to amazon page
//        driver.get("https://www.amazon.com");
//        driver ->>>>> Driver.getDriver()
        Driver.getDriver().get("https://www.amazon.com");
//        Verify the title includes amazon
//        driver.getTitle();
        String actualTitle = Driver.getDriver().getTitle();
//        assert actualTitle.contains("amazon");
        Assert.assertTrue(actualTitle.toLowerCase().contains("amazon"));

//        closing the driver
//        driver.quit();
        Driver.closeDriver();
    }
}
