package com.example.sreekuttyomanakuttan.mytestapp.activities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by sreekuttyOmanakuttan on 11-Sep-17.
 */

public class HeaddertActivity extends AbstractActivity {

   // private AppiumDriver<WebElement> driver;

   // public  ProductActivity(AppiumDriver<WebElement> driver)
  //  {
  //      this.driver=driver;
  //      PageFactory.initElements(driver,this);
   // }
     public HeaddertActivity(AppiumDriver driver)
      {
         super(driver);
     }
    //@FindBy(how= How.ID,using="in.amazon.mShop.android.shopping:id/action_bar_burger_icon")
    //@AndroidFindBy(id = "in.amazon.mShop.android.shopping:id/action_bar_burger_icon")
    @AndroidFindBy(xpath = "android.widget.ImageView")
    public WebElement CategoryMenu;


    @FindBy(how= How.XPATH,using="//android.widget.ImageView[@content-desc='Cart']")
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Cart']")
    public WebElement CartList_btn;



    public Boolean  VarifyCartImage()
    {
        String homeActName="AMAZON";
        return true;
    }

    public CartActivity  ClickonCartImage()
    {
        //click on cart image and return to the cart page
        return new CartActivity(driver);
    }

    public MenuSidebarList ClickonMenu() {
        return new MenuSidebarList(driver);
    }
}
