package org.child;

import java.io.IOException;

import org.base.ParentBase;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;

public class AdactinChild {
	public static void main(String[] args) throws InterruptedException, IOException {
		ParentBase p=new ParentBase();
		p.getDriver("chrome");
		p.launchUrl("https://adactin.com/HotelApp/");
		
		WebElement user = p.findBy("id", "username");
	    p.typeText(user, p.getDataFromExcel("C:\\Users\\ARI\\Desktop\\eworkspace\\Maven\\TestData\\Bok.xls", "Sheet1", 0, 1));
		WebElement pass = p.findBy("id", "password");
	    p.typeText(pass, p.getDataFromExcel("C:\\Users\\ARI\\Desktop\\eworkspace\\Maven\\TestData\\Bok.xls", "Sheet1", 1, 1));
	    p.screenshot("loginpage");
	    p.findBy("id", "login").click();
	   
	    Thread.sleep(2000);
	    WebElement location = p.findBy("id", "location");
	    p.selectByDropDown(location,"index" , p.getDataFromExcel("C:\\Users\\ARI\\Desktop\\eworkspace\\Maven\\TestData\\Bok.xls", "Sheet1", 3, 1));
	     
	    
	    
	  
	    WebElement hotels = p.findBy("visibletext", "Hotel Hervey");
	    p.selectByDropDown(hotels,"index" , p.getDataFromExcel("C:\\Users\\ARI\\Desktop\\eworkspace\\Maven\\TestData\\Bok.xls", "Sheet1", 4, 1));
	   
	    
	    WebElement room_type = p.findBy("id", "room_type");
	    p.selectByDropDown(room_type,"index" , p.getDataFromExcel("C:\\Users\\ARI\\Desktop\\eworkspace\\Maven\\TestData\\Bok.xls", "Sheet1", 5, 1));

	    WebElement room_nos = p.findBy("id", "room_nos");
	    p.selectByDropDown(room_nos,"index" , p.getDataFromExcel("C:\\Users\\ARI\\Desktop\\eworkspace\\Maven\\TestData\\Bok.xls", "Sheet1", 6, 1));

	    WebElement datepick_in = p.findBy("id", "datepick_in");
	    p.typeText(datepick_in, p.getDataFromExcel("C:\\Users\\ARI\\Desktop\\eworkspace\\Maven\\TestData\\Bok.xls", "Sheet1", 7, 1));
	    
	    WebElement datepick_out = p.findBy("id", "datepick_out");
	    p.typeText(datepick_out, p.getDataFromExcel("C:\\Users\\ARI\\Desktop\\eworkspace\\Maven\\TestData\\Bok.xls", "Sheet1", 8, 1));
	    
	    WebElement adult_room = p.findBy("id", "adult_room");
	    p.selectByDropDown(adult_room,"index" , p.getDataFromExcel("C:\\Users\\ARI\\Desktop\\eworkspace\\Maven\\TestData\\Bok.xls", "Sheet1", 9, 1));

	    WebElement child_room = p.findBy("id", "child_room");
	    p.typeText(child_room, p.getDataFromExcel("C:\\Users\\ARI\\Desktop\\eworkspace\\Maven\\TestData\\Bok.xls", "Sheet1", 10, 1));
	    
	    p.screenshot("details");
	    
	    p.findBy("id", "Submit").click();
	    
	    
	     p.findBy("id", "radiobutton_2").click();
	     p.screenshot("hotelselection");
	     p.findBy("id", "continue").click();
	     
	    
	    
	     WebElement first_name = p.findBy("id", "first_name");
		    p.typeText(first_name, p.getDataFromExcel("C:\\Users\\ARI\\Desktop\\eworkspace\\Maven\\TestData\\Bok.xls", "Sheet1", 12, 1));
		    
		    WebElement last_name = p.findBy("id", "last_name");
		    p.typeText(last_name, p.getDataFromExcel("C:\\Users\\ARI\\Desktop\\eworkspace\\Maven\\TestData\\Bok.xls", "Sheet1", 13, 1));
		    
		    WebElement address = p.findBy("id", "address");
		    p.typeText(address, p.getDataFromExcel("C:\\Users\\ARI\\Desktop\\eworkspace\\Maven\\TestData\\Bok.xls", "Sheet1", 14, 1));
		    
		    WebElement cc_num = p.findBy("id", "cc_num");
		    p.typeText(cc_num, p.getDataFromExcel("C:\\Users\\ARI\\Desktop\\eworkspace\\Maven\\TestData\\Bok.xls", "Sheet1", 15, 1));
	     
		    WebElement cc_type = p.findBy("id", "cc_type");
		    p.selectByDropDown(cc_type,"index" , p.getDataFromExcel("C:\\Users\\ARI\\Desktop\\eworkspace\\Maven\\TestData\\Bok.xls", "Sheet1", 16, 1));
		    
		    WebElement cc_exp_month = p.findBy("id", "cc_exp_month");
		    p.selectByDropDown(cc_exp_month,"index" , p.getDataFromExcel("C:\\Users\\ARI\\Desktop\\eworkspace\\Maven\\TestData\\Bok.xls", "Sheet1", 17, 1));
		    
		    WebElement cc_exp_year = p.findBy("id", "cc_exp_year");
		    p.selectByDropDown(cc_exp_year,"index" , p.getDataFromExcel("C:\\Users\\ARI\\Desktop\\eworkspace\\Maven\\TestData\\Bok.xls", "Sheet1", 18, 1));
	     
		    WebElement cc_cvv = p.findBy("id", "cc_cvv");
		    p.typeText(cc_cvv, p.getDataFromExcel("C:\\Users\\ARI\\Desktop\\eworkspace\\Maven\\TestData\\Bok.xls", "Sheet1", 19, 1));
	     
		    p.screenshot("booking");
		    p.findBy("id", "book_now").click();
		   
		    String text = p.findBy("id", "order_no").getAttribute("value");
		    System.out.println(text);
		    p.screenshot("orderno");
		    
		    p.writeDataToExcel("C:\\Users\\ARI\\Desktop\\eworkspace\\Maven\\TestData\\Bok.xls", "Sheet2", 0,1 , text);
		    
		    p.findBy("id", "logout").click();
		    
	     
	}

}
