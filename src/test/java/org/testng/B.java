package org.testng;

import org.testng.annotations.Test;

public class B {
	 @Test(groups= {"sanity","regression"})
		private void tc11() {
			System.out.println("test case 11");
		}
	 @Test(groups= {"sanity"})
	 private void tc13() {
			System.out.println("test case 13");
		}
	 @Test(groups= {"regression"})
	 private void tc15() {
			System.out.println("test case 15");
		}
	 @Test(groups= {"sanity","smoke"})
	 private void tc17() {
			System.out.println("test case 17");
		}

}
