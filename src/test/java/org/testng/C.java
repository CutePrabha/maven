package org.testng;

import org.testng.annotations.Test;

public class C {
	 @Test(groups= {"sanity","regression"})
		private void tc21() {
			System.out.println("test case 21");
		}
	 @Test(groups= {"sanity"})
	 private void tc23() {
			System.out.println("test case 23");
		}
	 @Test(groups= {"regression"})
	 private void tc25() {
			System.out.println("test case 25");
		}
	 @Test(groups= {"sanity","smoke"})
	 private void tc27() {
			System.out.println("test case 27");
		}
	 @Test(groups= {"sanity","smoke"})
	 private void tc28() {
			System.out.println("test case 27");
		}

}
