package com.example.sreekuttyomanakuttan.mytestapp.activities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by sreekuttyOmanakuttan on 11-Sep-17.
 */

public class ProductActivity extends AbstractActivity {

   // private AppiumDriver<WebElement> driver;

   // public  ProductActivity(AppiumDriver<WebElement> driver)
  //  {
  //      this.driver=driver;
  //      PageFactory.initElements(driver,this);
   // }
     public  ProductActivity(AppiumDriver driver)
      {
         super(driver);
     }

    @FindBy(how= How.XPATH,using="//android.widget.TextView[@text='Philips Beard Trimmer Cordless for Men QT4001/15']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Philips Beard Trimmer Cordless for Men QT4001/15']")
    public WebElement productName_txt;

    @Test
    public Boolean ProductPresentChek()
    {
        Boolean ProductAvailable=false;
        if(productName_txt.isDisplayed())
            ProductAvailable=true;

        return ProductAvailable;
    }

    @Test
    public void SelectTheProduct()
    {
        Assert.assertTrue(productName_txt.isDisplayed(),"The checked is present");
        productName_txt.click();

    }



}
