package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends Utility {
    By displayText = By.xpath("//div[@class='header_secondary_container']//span[@class='title']");
    By totalProducts = By.xpath("//div[@class='inventory_item']");

    public String getProductText() {
        return getTextFormElement(displayText);

    }

    public int getListOfProducts() {
        List<WebElement> count = driver.findElements(By.xpath("//div[@class='inventory_item']"));
        int totalProducts = count.size();
        System.out.println("Total Products are : " + totalProducts);
        return totalProducts;

    }
}
