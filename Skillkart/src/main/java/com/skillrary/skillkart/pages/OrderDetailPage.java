package com.skillrary.skillkart.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.skillrary.skillkart.generic.WebActionUtil;

public class OrderDetailPage extends BasePage
{
	public OrderDetailPage(WebDriver driver, WebActionUtil webActionUtil)  
	{
		super(driver,webActionUtil);
	}
	
	//ODP WebElements
	@FindBy(xpath="//tbody/tr//td[@class='cart_product']/a")
	private List<WebElement> cartProductsList;
	
	//Action Methods
	public boolean verifyProductIsAvailable(String productId)
	{
		productId="id_product="+productId;
		for(WebElement product:cartProductsList)
		{
			return product.getAttribute("href").contains(productId);
		}
		return false;
	}
}
//Assiginment=> delete the product from the order Detail Page and verify the product is Not displyed.