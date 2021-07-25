package org.testng;

import java.util.Date;

import org.base.ParentBase;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebElement;
import org.pom.Facepom;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Faceinput extends ParentBase {

	ParentBase p = new ParentBase();
	
	@BeforeClass
	public void beforeclass() {
		
		p.getDriver("chrome");
		p.launchUrl("https://www.facebook.com/");
	}

	@Before
    public void before() {
		Date date = new Date();
		System.out.println(date);
		}

	@Test
	public void test()
	{
		Facepom f=new Facepom();
		WebElement uname = f.getUname();
		p.typeText(uname, "thendral");
		Assert.assertEquals(uname.getAttribute("value"), "hendral" );
		
		WebElement pass = f.getPass();
		p.typeText(pass, "perezhil");
		WebElement login = f.getLogin();
		login.click();
	}
	
	@After
    public void after() {
		Date date = new Date();
		System.out.println(date);
		}
	
	
}
