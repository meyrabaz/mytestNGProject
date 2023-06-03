package com.myapp.utilities;
import org.testng.annotations.DataProvider;
public class DataProviderUtils {
    @DataProvider
    public Object[][] customerCredentials(){
//        This is a data source
        Object [][] customerInfo={
                {"customer1","12345"},
                {"customer2","54321"},
                {"customer3","67890"}
        };
        return customerInfo;
    }
    //    DATA FOR LOGIN TEST
    @DataProvider
    public Object[][] customerDataProvider(){
        Object [][] customerInfo={
                {"sam.walker@bluerentalcars.com","c!fas_art"},
                {"kate.brown@bluerentalcars.com","tad1$Fas"},
                {"raj.khan@bluerentalcars.com","v7Hg_va^"},
                {"pam.raymond@bluerentalcars.com","Nga^g6!"}
        };
        return customerInfo;
    }
    //    THIS DATA SOURCE WILL GET THE DATA FROM THE EXCEL SHEET
    @DataProvider
    public Object[][] excelCustomerDataProvider(){
        String path = "./src/test/java/resources/mysmoketestdata.xlsx";
        String sheetName = "customer_info";
        ExcelUtils excelUtils = new ExcelUtils(path,sheetName);
        Object[][] customerInfo = excelUtils.getDataArrayWithoutFirstRow();
        return customerInfo;
    }
}