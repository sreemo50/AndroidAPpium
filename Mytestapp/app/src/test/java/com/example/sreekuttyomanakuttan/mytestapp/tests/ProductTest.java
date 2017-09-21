package com.example.sreekuttyomanakuttan.mytestapp.tests;

import org.testng.annotations.Test;

/**
 * Created by sreekuttyOmanakuttan on 11-Sep-17.
 */

public class ProductTest extends AbstractTest {
   // public AppiumDriver<WebElement> driver;
    //ProductActivity productactivityObj;
    //ProductActivity productActivityObj;

    //public  ProductTest(AppiumDriver<WebElement> driver)
   // {
    //    this.driver=driver;
   //     this.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    //    productactivityObj=new ProductActivity(this.driver);

    //}



    @Test
    public Boolean CheckForProductPresent()
    {
      return amzonapp.ProductScreen().ProductPresentChek();

    }

}
