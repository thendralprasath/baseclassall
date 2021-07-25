package org.adactin;

import org.base.ParentBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends ParentBase{
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="radiobutton_0")
	private WebElement radiobutton_2;
	
	@FindBy(id="continue")
	private WebElement btncontinue;

	public WebElement getRadiobutton_2() {
		return radiobutton_2;
	}

	public WebElement getBtncontinue() {
		return btncontinue;
	}
	
}
