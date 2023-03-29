package com.smartbear.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.Arrays;
import java.util.List;

public class SmartBearViewOrderPage {
    public SmartBearViewOrderPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(linkText = "View all orders")
    WebElement viewOrder;
    public void clickViewAllOrder(){
        viewOrder.click();
    }
    @FindBy(xpath = "//tbody//tr//th")
    List<WebElement> tableOfAllInfo;

   List<String>allInfo= Arrays.asList("","Name","Product","#","Date","Street","City","State","Zip","Card","Card Number","Exp","");

    public void validation(){
        for(int i=1;i<tableOfAllInfo.size()-1;i++){
            Assert.assertEquals(tableOfAllInfo.get(i).getText(),allInfo.get(i).trim());
        }
    }
}
