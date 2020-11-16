package listeners;


import org.apache.logging.log4j.Logger;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import utilities.LoggerHelper;

public class RetryHelper implements IRetryAnalyzer{
	private static int counter = 0;
	private static int maxRetry = 16;
	
	private Logger log = LoggerHelper.loadLogger(RetryHelper.class);
	

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(counter<maxRetry) {
			log.info("Retrying Test "+result.getName()+" with status "+getResultStatusName(result.getStatus())+" for the "+(counter+1)+" times.");
			counter++;
		}
		
		return false;
	}

	public String getResultStatusName(int status) {
		String resultName = null;
		if(status==1) {
			resultName="Success";
		}
		if(status==2) {
			resultName="Failure";
		}
		if(status==3) {
			resultName="Skipped";
		}
		return resultName;
		
	}
}
