package Tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsDemo {

	ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
	ExtentReports extent;

	@BeforeSuite
	public void reportSetup() {

		// create ExtentReports and attach reporter(s)
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}

	@AfterSuite
	public void reportTearDown() {
		extent.flush();
	}

}
