package com.saucedemo.testsuite;

import com.saucedemo.pages.Loginpage;
import com.saucedemo.pages.ProductsPage;
import com.saucedemo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    Loginpage loginpage=new Loginpage();
    ProductsPage productsPage=new ProductsPage();

    @Test
    public void userSholdLoginSuccessfullyWithValidCredintials(){
        loginpage.enterUsername("standard_user");
        loginpage.enterPassword("secret_sauce");
        loginpage.clickOnLoginButton();
        String expectedErrorMessage = "PRODUCTS";

        Assert.assertEquals(productsPage.getProductText(),expectedErrorMessage,"Text is not displyed");
    }
@Test
    public void verifyThatSixProductsAreDisplayedOnPage(){
    loginpage.enterUsername("standard_user");
    loginpage.enterPassword("secret_sauce");
    loginpage.clickOnLoginButton();
        productsPage.getListOfProducts();
}
}
