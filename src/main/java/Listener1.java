

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener1 implements ITestListener{
    
     public void onTestStart(ITestResult result) {
     Reporter.log("TC execution started ", true);	
}
     public void onTestFailure(ITestResult result) {
	 Reporter.log("TC is failed", true);	
	}
    public void onTestSkipped(ITestResult result) {
	Reporter.log("TC is skipped", true);	
	}
    public void onTestSuccess(ITestResult result) {
	Reporter.log("TC is successfully run", true);
	}



}