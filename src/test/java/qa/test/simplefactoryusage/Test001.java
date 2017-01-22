package qa.test.simplefactoryusage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import qa.test.factory.SimpleReportFactory;

public class Test001 {
	
	private ExtentReports reporter =  SimpleReportFactory.getReporter();
	
	@Test
	public void simpleTest001()
	{
		ExtentTest testReporter = reporter.startTest("simpleTest001", "This is a simple simpleTest001");
		testReporter.log(LogStatus.INFO, "Starting test simpleTest001");
		int a = 107;
		int b = 37;

		testReporter.log(LogStatus.INFO, "Loading the value of a to " + a);
		testReporter.log(LogStatus.PASS, "Loading the value of b to " + b);
		reporter.endTest(testReporter);
	}

	@Test
	public void simpleTest002()
	{
		ExtentTest testReporter = reporter.startTest("simpleTest002", "This is a simple simpleTest001");
		testReporter.log(LogStatus.INFO, "Starting test simpleTest002");
		int a = 108;
		int b = 38;

		testReporter.log(LogStatus.INFO, "Loading the value of a to " + a);
		testReporter.log(LogStatus.PASS, "Loading the value of b to " + b);
		reporter.endTest(testReporter);
		
	}
	
	@AfterSuite
	public void afterSuite()
	{
		reporter.close();
	}
}
