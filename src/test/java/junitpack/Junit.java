package junitpack;

import java.util.Date;

import org.adactin.BookConfirmation;
import org.adactin.BookaHotel;
import org.adactin.Login;
import org.adactin.SearchHotel;
import org.adactin.SelectHotel;
import org.base.ParentBase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class Junit extends ParentBase{
	public static ParentBase p;
	
	@BeforeClass
	public static void beforeclass() {
		p = new ParentBase();
		p.getDriver("chrome");
		p.launchUrl("http://adactinhotelapp.com/");
		}

	@Before
	public void before() {
		Date d=new Date();
		System.out.println(d);
    }

	@Test
	public void tc0() {
		Login l=new Login();
	WebElement username = l.getUsername();
	p.typeText(username, "perezhil");
	WebElement password = l.getPassword();
	p.typeText(password, "Thendu123");
	WebElement login = l.getLogin();
	login.click();
	}

	@Test
	public void tc1() {
	SearchHotel s1=new SearchHotel();
	WebElement location = s1.getLocation();
	p.selectByDropDown(location, "index", "3");
	WebElement hotels = s1.getHotels();
	p.selectByDropDown(hotels, "index", "2");
	WebElement room_type = s1.getRoom_type();
	p.selectByDropDown(room_type,"index", "2");
	WebElement room_nos = s1.getRoom_nos();
	p.selectByDropDown(room_nos,"index", "6");
	WebElement datepick_in = s1.getDatepick_in();
	p.typeText(datepick_in, "05/07/2021");
	WebElement datepick_out = s1.getDatepick_out();
	p.typeText(datepick_out, "06/07/2021");
	
	WebElement adult_room = s1.getAdult_room();
	p.selectByDropDown(adult_room,"index", "2");
	WebElement child_room = s1.getChild_room();
	p.selectByDropDown(child_room, "index", "1");
	s1.getSubmit().click();
	}
	
	
	@Test
	public void tc2() {
		SelectHotel s2=new SelectHotel();
		s2.getRadiobutton_2().click();
		s2.getBtncontinue().click();
		}
	
	@Test
	public void tc3() {
		BookaHotel b1=new BookaHotel();
		WebElement first_name = b1.getFirst_name();
	p.typeText(first_name, "THENDRL");
	WebElement last_name = b1.getLast_name();
	p.typeText(last_name, "prasath");
	WebElement address = b1.getAddress();
	p.typeText(address, "up");
	WebElement cc_num = b1.getCc_num();
	p.typeText(cc_num, "8754321234567890");
	WebElement cc_type = b1.getCc_type();
	p.selectByDropDown(cc_type, "index", "2");
	WebElement cc_exp_month = b1.getCc_exp_month();
	p.selectByDropDown(cc_exp_month, "index", "2");
	WebElement cc_exp_year = b1.getCc_exp_year();
	p.selectByDropDown(cc_exp_year, "index", "6");	
	WebElement cc_cvv = b1.getCc_cvv();
	p.typeText(cc_cvv, "675");
	b1.getBook_now().click();
		
		}
	

	@Test
	public void tc4() {
		BookConfirmation b2=new BookConfirmation();
		String attribute = b2.getOrder_no().getAttribute("value");
		System.out.println(attribute);
		b2.getLogout().click();
			
		
	}
	
	
	
	
	@After
	public void after() {
		
		Date d=new Date();
		System.out.println(d);
	}
	
	@AfterClass
	public static void afterclass() {
		driver.quit();

	}
}
