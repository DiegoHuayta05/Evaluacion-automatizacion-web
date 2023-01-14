package com.nttdata.page;

import org.openqa.selenium.By;

public class InventoryPage {
    public static By productsTitle = By.cssSelector("span.title");
    public static By itemsCards = By.cssSelector("div.inventory_item");

    public static By nameItem = By.xpath("//*[@id=\"item_0_title_link\"]");
    public static By addCart = By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[2]/div[2]/div[2]/button");
    public static By shoppingCart = By.xpath("//*[@id=\"shopping_cart_container\"]");
}
