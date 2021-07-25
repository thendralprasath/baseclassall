package org.child;
import java.io.IOException;

import org.adactin.BookConfirmation;
import org.adactin.BookaHotel;
import org.adactin.Login;
import org.adactin.SearchHotel;
import org.adactin.SelectHotel;
import org.base.ParentBase;
import org.openqa.selenium.WebElement;

public class PomAdactin {
	public static void main(String[] args) throws InterruptedException, IOException {
		ParentBase p=new ParentBase();
		p.getDriver("chrome");
		p.launchUrl("https://adactin.com/HotelApp/");
		Thread.sleep(3000);
		Login l =new Login();
		    WebElement user =l.getUsername();
			p.typeText(user, "perezhil");
			WebElement pass =l.getPassword();
			p.typeText(pass, "Thendu123");
			WebElement log =l.getLogin();
			p.btnclick(log);
			
		//Thread.sleep(3000);
		
		 SearchHotel s =new  SearchHotel();
	     WebElement location = s.getLocation();
	     p.selectByDropDown(location, "index", "3");
	     
	     WebElement hotel = s.getHotels();
	     p.selectByDropDown(hotel, "index", "2");
	     
	     WebElement rtype = s.getRoom_type();
	     p.selectByDropDown(rtype, "index", "2");
	     
	     WebElement rnos = s.getRoom_nos();
	     p.selectByDropDown(rnos, "index", "2");
	     
	     WebElement datein = s.getDatepick_in();
	     p.typeText(datein, "21-9-21");
	     
	     
	     WebElement dateout = s.getDatepick_in();
	     p.typeText(dateout, "27-9-21");
	     
	     WebElement adultr = s.getChild_room();
	     p.selectByDropDown(adultr, "index", "2");
	     
	     
	     WebElement childr = s.getChild_room();
	     p.selectByDropDown(childr, "index", "2");
	     
	   s.getSubmit().click();
	   
	   
	   //Thread.sleep(3000);
	   SelectHotel s1=new SelectHotel();
	   s1.getRadiobutton_2().click();
	   s1.getBtncontinue().click();
	   
	   
	   //Thread.sleep(3000);
	   BookaHotel b=new BookaHotel();
	   
	   WebElement first_name = b.getFirst_name();
	   p.typeText(first_name, "thendral");
	   
	   WebElement last_name = b.getLast_name();
	   p.typeText(last_name, "prasath");
	   
	   WebElement address = b.getAddress();
	   p.typeText(address, "pvvjbvjhcucucutcutctyc");
	   
	   WebElement cc_num = b.getCc_num();
	   p.typeText(cc_num, "6764321234567890");
	   
	   WebElement cc_type =b.getCc_type();
	   p.selectByDropDown(cc_type, "index", "2");
	     
	     WebElement cc_exp_month =b.getCc_exp_month();
	     p.selectByDropDown(cc_exp_month, "index", "6");
	     
	     WebElement cc_exp_year =b.getCc_exp_year();
	     p.selectByDropDown(cc_exp_year, "index", "6");
	   
	     
	     WebElement cc_cvv = b.getCc_cvv();
		 p.typeText(cc_cvv, "655");
	   
	     b.getBook_now().click();
	   
	     //Thread.sleep(3000);
	   BookConfirmation b1=new BookConfirmation();
	   WebElement order_no = b1.getOrder_no();
	  
	   System.out.println(p.getAttributeValue(order_no, "value"));
	   
	   b1.getLogout().click();
	     
		
}
}
