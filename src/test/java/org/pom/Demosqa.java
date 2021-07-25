package org.pom;

import org.base.ParentBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demosqa extends ParentBase{
	
	
	public Demosqa() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@name='your-name']")
	private WebElement name;
	@FindBy(name="your-email")
	private WebElement email;
	@FindBy(name="your-mobile")
	private WebElement mobile;
	@FindBy(name="your-country")
	private WebElement country;
	@FindBy(name="your-city")
	private WebElement city;
	@FindBy (name="your-message")
	private WebElement msg;
	public WebElement getName() {
		return name;
	}
	public void setName(WebElement name) {
		this.name = name;
	}
	public WebElement getEmail() {
		return email;
	}
	public void setEmail(WebElement email) {
		this.email = email;
	}
	public WebElement getMobile() {
		return mobile;
	}
	public void setMobile(WebElement mobile) {
		this.mobile = mobile;
	}
	public WebElement getCountry() {
		return country;
	}
	public void setCountry(WebElement country) {
		this.country = country;
	}
	public WebElement getCity() {
		return city;
	}
	public void setCity(WebElement city) {
		this.city = city;
	}
	public WebElement getMsg() {
		return msg;
	}
	public void setMsg(WebElement msg) {
		this.msg = msg;
	}
	
		
}
