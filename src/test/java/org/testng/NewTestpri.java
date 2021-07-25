package org.testng;

import org.testng.annotations.Test;

public class NewTestpri {
  @Test(priority=6)
  public void f() {
	  System.out.println("its test");
  }
  
  @Test(priority=-17)
  public void f1() {
	  System.out.println("its test1");
  }
  
  @Test
  public void f2() {
	  System.out.println("its test2");
  }
  
  @Test(priority=3, invocationCount=5)
  public void f3() {
	  System.out.println("its test3");
  }
  
  @Test(priority=0)
  public void f4() {
	  System.out.println("its test4");
  }
  
  @Test(priority=-8,enabled=false)
  public void f5() {
	  System.out.println("its test5");
  }
  
}

