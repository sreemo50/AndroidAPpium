package com.example.sreekuttyomanakuttan.mytestapp.tests;

import com.example.sreekuttyomanakuttan.mytestapp.activities.AccountDetailsActivity;
import com.example.sreekuttyomanakuttan.mytestapp.activities.HomeActivity;
import com.example.sreekuttyomanakuttan.mytestapp.activities.ProductActivity;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by sreekuttyOmanakuttan on 10-Sep-17.
 */

public class HomeTest extends AbstractTest
{
    private ProductActivity productAct;
    private AccountDetailsActivity accountdetAct;
    //public AppiumDriver<WebElement> driver;
    //HomeActivity homeactivityObj;
    //ProductTest producttest;


    //public  HomeTest(AppiumDriver<WebElement> driver)
  //  {
   //     this.driver=driver;
  //      this.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
  //      homeactivityObj=new HomeActivity(this.driver);
  //      producttest=new ProductTest(this.driver);
//
   // }
    @Test(priority=1)
    public void VarifyHomeActivity() throws InterruptedException {
        //HomeActivity hact=new HomeActivity();
        System.out.println("Checking the activity is correct");
        HomeActivity hact=new HomeActivity(appiumDriver);
        //driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
        Assert.assertTrue(hact.VarifyHomeActivity(),"Yes we are in home activity");
         }


    /*@Test
    public void CheckForProduct() throws InterruptedException {
        //HomeActivity hact=new HomeActivity();
        amzonapp.HomeScreen().TypeProductname("Trimmer");
        Assert.assertTrue(amzonapp.ProductScreen().productName_txt.isDisplayed(),"The checked is present");
        amzonapp.ProductScreen().SelectTheProduct();
    }*/
    @Test(priority=0)
    public void CheckForProduct() throws InterruptedException {
        //HomeActivity hact=new HomeActivity();
        HomeActivity hact=new HomeActivity(appiumDriver);
        productAct=hact.TypeProductname("Trimmer");
        productAct.SelectTheProduct();
    }

    @Test(priority=2)
    public void CheckForAccountDteails() throws InterruptedException {
        //HomeActivity hact=new HomeActivity();
        HomeActivity hact=new HomeActivity(appiumDriver);
        accountdetAct=hact.ClickOnAccountDetails();
    }







}



