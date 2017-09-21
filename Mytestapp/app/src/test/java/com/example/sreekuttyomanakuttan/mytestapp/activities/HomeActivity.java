package com.example.sreekuttyomanakuttan.mytestapp.activities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by sreekuttyOmanakuttan on 06-Sep-17.
 */

public class HomeActivity extends AbstractActivity{

    //private AppiumDriver<WebElement> driver;


    //public  HomeActivity(AppiumDriver<WebElement> driver)
   // {
   //     this.driver=driver;
   //     PageFactory.initElements(driver,this);
   // }

   public  HomeActivity(AppiumDriver driver)
     {
         super(driver);
     }



    //@FindBy(how= How.XPATH,using="android.widget.ImageView[@content-desc='Navigation panel, button, double tap to open side panel']")
    //@AndroidFindBy(xpath = "android.widget.ImageView[@content-desc='Navigation panel, button, double tap to open side panel']")

    //@FindBy(how= How.ID,using="in.amazon.mShop.android.shopping:id/action_bar_burger_icon")
    //@AndroidFindBy(id = "in.amazon.mShop.android.shopping:id/action_bar_burger_icon")
    @AndroidFindBy(xpath = "android.widget.ImageView")
    public WebElement CategoryMenu;

    @FindBy(how= How.XPATH,using="//android.widget.ImageView[@content-desc='Cart']")
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Cart']")
    public WebElement addToCart_btn;

    @FindBy(how= How.XPATH,using="//android.widget.TextView[@text='Shop by\n"    +
            "Category']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Shop by\n" +
            "Category']")
    public WebElement shopByCategory_btn;

    @FindBy(how= How.XPATH,using="//android.widget.EditText[@text='What are you looking for?']")
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='What are you looking for?']")
    public WebElement productSearch_txtbx;

    @FindBy(how= How.XPATH,using="android.view.View[Contains(@resource-id,'gw-mobile-greeting-bar')]")
    @AndroidFindBy(xpath = "android.view.View[Contains(@resource-id,'gw-mobile-greeting-bar')]")
    public WebElement your_Account_lnk;


    public void tapOn_your_Account_lnk()
    {
        your_Account_lnk.click();
    }
    public void tapOn_shopByCategory_btn()
    {
        shopByCategory_btn.click();
    }
    public void tapOn_productSearch_txtbx()
    {
        productSearch_txtbx.click();
    }
    public void tapOn_addToCart_btn()
    {
        addToCart_btn.click();
    }




    public void CheckForTheProduct(String productName)
    {
        tapOn_productSearch_txtbx();
        productSearch_txtbx.sendKeys(productName+"\n");

    }


}
