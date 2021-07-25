package org.testng;

import org.testng.annotations.Test;

public class Rerun {
	@Test
	private void tc0() {
		System.out.println("test 0");
	}
	@Test
	private void tc1() {
		System.out.println("test 1");
	}
	@Test
	private void tc2() {
		Assert.assertTrue(false);
		System.out.println("test 2");
	}
	@Test
	private void tc3() {
		System.out.println("test 3");
	}
	
	@Test
	private void tc4() {
		System.out.println("test 4");
	}
	
}
