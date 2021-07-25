package org.pom;

import org.base.ParentBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facepom extends ParentBase{
	
	public Facepom() {
		PageFactory.initElements(driver, this);
		
	}
@FindBy(id="email")
private WebElement uname;

@FindBy(id="pass")
private WebElement pass;

@FindBy(name="login")
private WebElement login;

public WebElement getUname() {
	return uname;
}

public void setUname(WebElement uname) {
	this.uname = uname;
}

public WebElement getPass() {
	return pass;
}

public void setPass(WebElement pass) {
	this.pass = pass;
}

public WebElement getLogin() {
	return login;
}

public void setLogin(WebElement login) {
	this.login = login;
}


	
}
