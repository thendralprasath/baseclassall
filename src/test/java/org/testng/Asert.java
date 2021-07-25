package org.testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Asert {

	@Test
	 public void softAssert(){
	 SoftAssert softAssertion= new SoftAssert();
	 System.out.println("softAssert Method Was Started");
	 softAssertion.assertTrue(false);
	 //softAssertion.assertAll();
	 System.out.println("softAssert Method Was Executed");
	 }
	 
	 @Test
	 public void hardAssert(){
	 System.out.println("hardAssert Method Was Started");
	 Assert.assertTrue(false);
	 System.out.println("hardAssert Method Was Executed");
	 }
}
