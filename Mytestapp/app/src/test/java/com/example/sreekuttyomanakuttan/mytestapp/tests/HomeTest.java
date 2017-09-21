package com.example.sreekuttyomanakuttan.mytestapp.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by sreekuttyOmanakuttan on 10-Sep-17.
 */

public class HomeTest extends  AbstractTest
{
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



    @Test
    public void CheckForProduct()
    {
        amzonapp.HomeScreen().CheckForTheProduct("Trimmer");
        Assert.assertTrue(amzonapp.ProductScreen().ProductPresentChek(),"The checked is present");


    }




}



