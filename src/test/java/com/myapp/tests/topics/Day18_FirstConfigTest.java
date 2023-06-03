package com.myapp.tests.topics;
import com.myapp.utilities.ConfigReader;
import com.myapp.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Day18_FirstConfigTest {
    @Test
    public void firstConfigTest(){
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));
        String actualTitle= Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.toLowerCase().contains(ConfigReader.getProperty("amazon_title")));

    }
}