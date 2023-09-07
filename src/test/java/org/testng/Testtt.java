package org.testng;

import org.testng.annotations.Test;

public class Testtt {
 @Test(groups= {"somke"})
	private void tc1() {
		System.out.println("test case 1");
	}
 @Test(groups= {"sanity"})
 private void tc3() {
		System.out.println("test case 3");
	}
 @Test(groups= {"somke"})
 private void tc5() {
		System.out.println("test case 5");
	}
 @Test(groups= {"regression"})
 private void tc7() {
		System.out.println("test case 7");
	}
	
	
	
	
	
	
	
	


}
