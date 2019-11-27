package com.phptravels.extentreports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.phptravels.constants.FilePath;


/**
 * In this class, extent report is made
 */

public class ExtentReport   {
	static ExtentHtmlReporter reporter = new ExtentHtmlReporter(FilePath.EXTENT_REPORT);
	static ExtentReports extent = new ExtentReports();

	public static void reportLog(String testname, String Failuremsg) {
	extent.attachReporter(reporter);
	ExtentTest logger = extent.createTest(testname);
	logger.log(Status.INFO, testname);
	logger.log(Status.PASS, testname);
	
	extent.flush();
	}
	
	
	
	
	
}
	