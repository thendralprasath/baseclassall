package org.adactin;

import org.base.ParentBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookConfirmation extends ParentBase{
	
	 public BookConfirmation() {
		 PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="order_no")
	private WebElement order_no;
	
	public WebElement getOrder_no() {
		return order_no;
	}

	public WebElement getLogout() {
		return logout;
	}

	@FindBy(id="logout")
	private WebElement logout;
	
	
}
