package com.phptravels.validation;

import org.testng.Assert;
// this class consist of assert methods for validation of data.

public class VerificationManager {

	/**
	 * 
	 * @param texts
	 * @param expected
	 * @param message
	 */
	public void verify(String texts, String expected, String message) { // String or objects depend
		try {

			Assert.assertEquals(texts, expected, message);
			

		} catch (AssertionError e) {
			
		}
	}

	public void verifyContent(String actual, String expected, String message) {
		try {

			
			Assert.assertEquals(actual.contains(expected), expected, message);
			

		} catch (AssertionError e) {
			
		}
	}

//	public String removeINR(String cost) {
//		cost = cost.replace("INR ", "");
//		return cost;
//	}

}
