package com.example.sreekuttyomanakuttan.mytestapp.activities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by sreekuttyOmanakuttan on 09-Sep-17.
 */

public class CalculateActivity {

    private AppiumDriver<WebElement> driver;

    @FindBy(how= How.XPATH,using="android.widget.EditText")
    @AndroidFindBy(xpath = "android.widget.EditText")
    public WebElement EditText_txt;

   // @FindBy(how= How.XPATH,using="android.widget.Button[@test='=']")
   // @AndroidFindBy(xpath = "android.widget.Button[@test='=']")
   // public WebElement EnterValueText;

    @FindBy(how= How.XPATH,using="android.widget.Button[@test='C']")
    @AndroidFindBy(xpath = "android.widget.Button[@test='C']")
    public WebElement Cancel_btn;

    @FindBy(how= How.XPATH,using="android.widget.Button[@test='÷']")
    @AndroidFindBy(xpath = "android.widget.Button[@test='÷']")
    public WebElement Division_txtbx;

    @FindBy(how= How.XPATH,using="android.widget.Button[@test='×']")
    @AndroidFindBy(xpath = "android.widget.Button[@test='×']")
    public WebElement Multiplicationt_btn;

    @FindBy(how= How.XPATH,using="android.widget.Button[@test='+']")
    @AndroidFindBy(xpath = "android.widget.Button[@test='+']")
    public WebElement Addition_btn;

    @FindBy(how= How.XPATH,using="android.widget.Button[@test='-']")
    @AndroidFindBy(xpath = "android.widget.Button[@test='-']")
    public WebElement Subtraction_btn;

    @FindBy(how= How.XPATH,using="android.widget.Button[@test='( )']")
    @AndroidFindBy(xpath = "android.widget.Button[@test='( )']")
    public WebElement Bracket_btn;

    @FindBy(how= How.XPATH,using="android.widget.Button[@test='=']")
    @AndroidFindBy(xpath = "android.widget.Button[@test='=']")
    public WebElement Equal_btn;

    @FindBy(how= How.XPATH,using="android.widget.Button[@test='.']")
    @AndroidFindBy(xpath = "android.widget.Button[@test='.']")
    public WebElement Point_btn;

    @FindBy(how= How.XPATH,using="android.widget.ImageButton")
    @AndroidFindBy(xpath = "android.widget.ImageButton")
    public WebElement Back_btn;

    @FindBy(how= How.XPATH,using="android.widget.Button[@test='0']")
    @AndroidFindBy(xpath = "android.widget.Button[@test='0']")
    public WebElement Zero_btn;

    @FindBy(how= How.XPATH,using="android.widget.Button[@test='1']")
    @AndroidFindBy(xpath = "android.widget.Button[@test='1']")
    public WebElement One_btn;

    @FindBy(how= How.XPATH,using="android.widget.Button[@test='2']")
    @AndroidFindBy(xpath = "android.widget.Button[@test='2']")
    public WebElement Two_btn;

    @FindBy(how= How.XPATH,using="android.widget.Button[@test='3']")
    @AndroidFindBy(xpath = "android.widget.Button[@test='3']")
    public WebElement Three_btn;

    @FindBy(how= How.XPATH,using="android.widget.Button[@test='4']")
    @AndroidFindBy(xpath = "android.widget.Button[@test='4']")
    public WebElement Four_btn;

    @FindBy(how= How.XPATH,using="android.widget.Button[@test='5']")
    @AndroidFindBy(xpath = "android.widget.Button[@test='5']")
    public WebElement Five_btn;

    @FindBy(how= How.XPATH,using="android.widget.Button[@test='6']")
    @AndroidFindBy(xpath = "android.widget.Button[@test='6']")
    public WebElement Six_btn;

    @FindBy(how= How.XPATH,using="android.widget.Button[@test='7'] ")
    @AndroidFindBy(xpath = "android.widget.Button[@test='7']")
    public WebElement Seven_btn;

    @FindBy(how= How.XPATH,using="android.widget.Button[@test='8']")
    @AndroidFindBy(xpath = "android.widget.Button[@test='8']")
    public WebElement Eight_btn;

    @FindBy(how= How.XPATH,using="android.widget.Button[@test='9']")
    @AndroidFindBy(xpath = "android.widget.Button[@test='9']")
    public WebElement Nine_btn;

    @FindBy(how= How.XPATH,using="android.widget.Button[@test='G']")
    @AndroidFindBy(xpath = "android.widget.Button[@test='G']")
    public WebElement PlusOrMinus_btn;





    public void CalculateActivity(AppiumDriver<WebElement> driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    public void tapOn_EditText_txt()
    {
        EditText_txt.click();
    }

    public void tapOn_Cancel_btn()
    {
        Cancel_btn.click();
    }

    public void tapOn_Division_txtbx()
    {
        Division_txtbx.click();
    }

    public void tapOn_Multiplicationt_btn()
    {
        Multiplicationt_btn.click();
    }

    public void tapOn_Addition_btn()
    {
        Addition_btn.click();
    }

    public void tapOn_Subtraction_btn()
    {
        Subtraction_btn.click();
    }

    public void tapOn_Bracket_btn()
    {
        Bracket_btn.click();
    }

    public void tapOn_Equal_btn()
    {
        Equal_btn.click();
    }

    public void tapOn_Point_btn()
    {
        Point_btn.click();
    }

    public void tapOn_Back_btn()
    {
        Back_btn.click();
    }

    public void tapOn_Zero_btn()
    {
        Zero_btn.click();
    }

    public void tapOn_One_btn()
    {
        One_btn.click();
    }

    public void tapOn_Two_btn()
    {
        Two_btn.click();
    }

    public void tapOn_Three_btn()
    {
        Three_btn.click();
    }

    public void tapOn_Four_btn()
    {
        Four_btn.click();
    }

    public void tapOn_Five_btn()
    {
        Five_btn.click();
    }

    public void tapOn_Six_btn()
    {
        Six_btn.click();
    }

    public void tapOn_Seven_btn()
    {
        Seven_btn.click();
    }

    public void tapOn_Eight_btn()
    {
        Eight_btn.click();
    }

    public void tapOn_Nine_btn()
    {
        Nine_btn.click();
    }

    public void tapOn_PlusOrMinus_btn()
    {
        PlusOrMinus_btn.click();
    }

///main functionalities

    public void Addition()
    {
        tapOn_One_btn();
        tapOn_Addition_btn();
        tapOn_Five_btn();
        tapOn_Equal_btn();
    }

    public void Subtraction()
    {
        PlusOrMinus_btn.click();
    }

    public void Multiplication()
    {
        PlusOrMinus_btn.click();
    }

    public void Divition()
    {
        PlusOrMinus_btn.click();
    }



}
