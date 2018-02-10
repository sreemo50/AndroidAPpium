package com.example.sreekuttyomanakuttan.mytestapp.activities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.concurrent.TimeUnit;

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
         driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
     }



    public HeaddertActivity HedderareaPropertyt;
    //@FindBy(how= How.XPATH,using="android.widget.ImageView[@content-desc='Navigation panel, button, double tap to open side panel']")
    //@AndroidFindBy(xpath = "android.widget.ImageView[@content-desc='Navigation panel, button, double tap to open side panel']")


    @FindBy(how= How.XPATH,using="//android.widget.TextView[@text='Shop by\n"    +
            "Category']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Shop by\n" +
            "Category']")
    public WebElement shopByCategory_btn;

    @FindBy(how= How.XPATH,using="//android.widget.EditText[@text='What are you looking for?']")
    //@AndroidFindBy(xpath = "//android.widget.EditText[@text='What are you looking for?']")
    //@AndroidFindBy(id = "in.amazon.mShop.android.shopping:id/rs_search_src_text")
    //@FindBy(how= How.ID,using="in.amazon.mShop.android.shopping:id/rs_search_src_text")
    public WebElement productSearch_txtbx;

    @FindBy(how= How.XPATH,using="android.view.View[Contains(@resource-id,'gw-mobile-greeting-bar')]")
    @AndroidFindBy(xpath = "android.view.View[Contains(@resource-id,'gw-mobile-greeting-bar')]")
    public WebElement your_Account_lnk;




    public  String GetyHomeActivityTitle()
    {

        System.out.println("GetyHomeActivityTitle");
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
        String title=driver.getTitle();
        System.out.println("VarifyHomeActivity"+""+title);
        return title;
    }

    public Boolean  VarifyHomeActivity()
    {
        String homeActName="AMAZON";
        System.out.println("VarifyHomeActivity"+""+homeActName);
        return GetyHomeActivityTitle().contains(homeActName);
    }



    public void  ClickOnShopByCategory()
    {
        //click on shop by category button and returns to the category list;
    }


    public ProductActivity TypeProductname(String productName)
    {
        productSearch_txtbx.click();
        productSearch_txtbx.sendKeys(productName+"\n");
        return new ProductActivity(driver);
    }


    public AccountDetailsActivity ClickOnAccountDetails() {
        return new AccountDetailsActivity(driver);
    }
}
