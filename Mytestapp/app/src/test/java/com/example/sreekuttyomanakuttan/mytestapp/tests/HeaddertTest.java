package com.example.sreekuttyomanakuttan.mytestapp.tests;

import com.example.sreekuttyomanakuttan.mytestapp.activities.CartActivity;
import com.example.sreekuttyomanakuttan.mytestapp.activities.HeaddertActivity;
import com.example.sreekuttyomanakuttan.mytestapp.activities.MenuSidebarList;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by sreekuttyOmanakuttan on 10-Sep-17.
 */

public class HeaddertTest extends AbstractTest
{
    private CartActivity cartAct;
    private MenuSidebarList menuside;
    //public AppiumDriver<WebElement> driver;
    //HomeActivity homeactivityObj;
    //ProductTest producttest;

    @Test
    public void VarifyCArtBtnPresent() throws InterruptedException {
        //HomeActivity hact=new HomeActivity();
        System.out.println("Cart Image is present");
        HeaddertActivity headertact=new HeaddertActivity(appiumDriver);
        Assert.assertTrue(headertact.VarifyCartImage(),"Yes cartimage is present");
         }



    @Test
    public void ClickCartButton() throws InterruptedException {
        //HomeActivity hact=new HomeActivity();
        HeaddertActivity headertact=new HeaddertActivity(appiumDriver);
        cartAct=headertact.ClickonCartImage();
    }



    @Test
    public void ClickMenuButton() throws InterruptedException {
        //HomeActivity hact=new HomeActivity();
        HeaddertActivity headertact=new HeaddertActivity(appiumDriver);
        menuside=headertact.ClickonMenu();

    }


}



