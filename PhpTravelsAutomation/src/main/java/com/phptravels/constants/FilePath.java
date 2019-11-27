package com.phptravels.constants;

import java.io.File;
// this class conatin all file paths
public class FilePath {

	
	public final static String USER_HOME = System.getProperty("user.dir") + File.separator;
	public final static String RESOURCES_HOME = USER_HOME + "src" + File.separator + "test" + File.separator
			+ "resources" + File.separator;

	public static final String OBJECT_REPOSITARY = RESOURCES_HOME+"pageobject";
	public static final String TEST_DATA = RESOURCES_HOME+"testdata";
	public static final String Logger=RESOURCES_HOME+"log4j";
	
	
	public static final String EXTENT_REPORT = "./extentreport/extentReport.html";
	
	
	
	public static final String CHROME_EXE = "lib" + File.separator + "chromedriver.exe";
	public static final String FIREFOX_EXE = "lib" + File.separator + "geckodriver.exe";
	public static final String IE_EXE = "lib" + File.separator + "IEDriverServer.exe";
	public static final String CONFIG_FILE = "config.properties";
	
    public static final String Log4j=Logger+File.separator+	"log4j.properties";
    public static final String EFFECTIVE_DATE_CHANGE=TEST_DATA+File.separator+"policyeffectivedate.xlsx";
     public static final String PRACTICE="./src/test/resources/testdata/writeexcel.xlsx";
     
     public static final String PHPTRAVELL_LOCATOR=OBJECT_REPOSITARY+File.separator+"phptravels.properties";
     
     public static final String PHP_TESTDATA =TEST_DATA+File.separator+"phptravelsdashboard.xlsx";
    // /PhpTravellsAutomation/src/test/resources/testdata/bookingdetails.xlsx
	public static final String BOOKING_DETAILS=TEST_DATA+File.separator+"bookingdetails.xlsx";
	
	
	
}
