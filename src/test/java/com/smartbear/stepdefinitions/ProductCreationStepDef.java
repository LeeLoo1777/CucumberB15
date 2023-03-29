package com.smartbear.stepdefinitions;

import com.smartbear.pages.SmartBearLoginPage;
import com.smartbear.pages.SmartBearMainPage;
import com.smartbear.pages.SmartBearOrderPage;
import com.smartbear.pages.SmartBearViewOrderPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class ProductCreationStepDef {
    //paste here snips:
    WebDriver driver= DriverHelper.getDriver();
    SmartBearLoginPage smartBearLoginPage=new SmartBearLoginPage(driver);
    SmartBearMainPage smartBearMainPage=new SmartBearMainPage(driver);
    SmartBearOrderPage smartBearOrderPage=new SmartBearOrderPage(driver);
    SmartBearViewOrderPage smartBearViewOrderPage=new SmartBearViewOrderPage(driver);
    @Given("User login with username,password and click Order Button")
    public void user_login_with_username_password_and_click_order_button() {
        smartBearLoginPage.login(ConfigReader.readProperty("smartbearusername"),ConfigReader.readProperty("smartbearpassword"));
    }

    @Given("User provides {string},{string} for product information")
    public void user_provides_for_product_information(String product, String quantity) throws InterruptedException {
        smartBearMainPage.clickOrderButton();
        Thread.sleep(1000);
        smartBearOrderPage.sendProductInformation(product, quantity);
    }

    @Given("User provides {string},{string},{string},{string},{string} for address information")
    public void user_provides_for_address_information(String customerName, String street, String city, String state, String zipCode) {
    smartBearOrderPage.sendAddressInformation(customerName, street, city, state, zipCode);
    }

    @Given("User provides {string},{string},{string} for payment information")
    public void user_provides_for_payment_information(String cardType, String cardNumber, String expireDate) {
        smartBearOrderPage.sendPaymentInformation(cardType, cardNumber, expireDate);
    }

    @Then("User clicks process button and validates {string}")
    public void user_clicks_process_button_and_validates(String string) {
      smartBearOrderPage.validateMessage(string);
    }
        @Then("User validates all the information {string},'product,'quantity','date','street','city','state','zip','card','cardNumber','expireDate'")
        public void user_validates_all_the_information_product_quantity_date_street_city_state_zip_card_card_number_expire_date(String string) {
            smartBearViewOrderPage.clickViewAllOrder();
            smartBearViewOrderPage.validation();
        }


}
