package reTry_FailedTestCases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer_1 implements IRetryAnalyzer{
	private int retryCount = 0;
    private static final int MAX_RETRY_COUNT = 3;

	
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if (retryCount < MAX_RETRY_COUNT) {
            retryCount++;
            return true;
      
        	}
		return false;
	}

	
		 /*private int retryCount = 0;
		    private static final int MAX_RETRY_COUNT = 3;

		    @Override
		    public boolean retry(ITestResult result) {
		    	
		        if (retryCount < MAX_RETRY_COUNT) {
		            retryCount++;
		            return true;
		      
		        	}
				return false;
				}
*/}


		