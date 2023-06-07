package com.myapp.tests.dataprovider;
import com.myapp.pages.RentalHomePage;
import com.myapp.pages.RentalLoginPage;
import com.myapp.utilities.*;
import org.testng.annotations.Test;
public class Day22_DataProvider4 {
    //    We need 2 methods : ****@DataProvider ***@Test method
//    DataProvider3 gets data from customerDataProvider from utils
//    DataProvider4 gets data from excelCustomerDataProvider from utils FROM EXCEL
//    The only difference is dataProvider = "excelCustomerDataProvider"
    RentalHomePage rentalHomePage;
    RentalLoginPage rentalLoginPage;
    @Test(dataProvider = "excelCustomerDataProvider",dataProviderClass = DataProviderUtils.class)
    public void customerLoginTest(String username,String password){
        System.out.println(username + password);
        Driver.getDriver().get(ConfigReader.getProperty("rental_home_url"));
        rentalHomePage = new RentalHomePage();
        rentalLoginPage = new RentalLoginPage();
//            LOG IN
//            click on login
        WaitUtils.waitFor(1);
        rentalHomePage.loginLink.click();
        WaitUtils.waitFor(1);
//            enter username
        rentalLoginPage.userEmail.sendKeys(username);//GET DATA FROM DATA PROVIDER
        WaitUtils.waitFor(1);
//            enter password
        rentalLoginPage.userPassword.sendKeys(password);//GET DATA FROM DATA PRIVIDER
        WaitUtils.waitFor(1);
//            click on login button
        rentalLoginPage.loginButton.click();
        WaitUtils.waitFor(1);
//            verify login
        ReusableMethods.verifyElementDisplayed(rentalHomePage.userID);
        WaitUtils.waitFor(1);
//            LOG OUT
//            click on id
        rentalHomePage.userID.click();
        WaitUtils.waitFor(3);
//            click on logout
        rentalHomePage.logOut.click();
        WaitUtils.waitFor(1);
//            click on ok
        rentalHomePage.OK.click();
        WaitUtils.waitFor(1);
        Driver.closeDriver();
    }
}