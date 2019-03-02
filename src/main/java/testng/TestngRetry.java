package testng;

import log4j.LoggerControler;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.Reporter;
import testng.utils.ConfigReader;

/**
 * TestNG retry Analyzer.
 * @author kevinkong
 *
 */
public class TestngRetry implements IRetryAnalyzer {
	final static LoggerControler logger = LoggerControler.getLogger(TestngRetry.class);
	private int retryCount = 1;
	private static int maxRetryCount;

	static {
		ConfigReader config = ConfigReader.getInstance();
		maxRetryCount = config.getRetryCount();
		logger.info("retrycount=" + maxRetryCount);
		logger.info("sourceCodeDir=" + config.getSourceCodeDir());
		logger.info("sourceCodeEncoding=" + config.getSrouceCodeEncoding());
	}

	public boolean retry(ITestResult result) {
		if (retryCount <= maxRetryCount) {
			String message = "Retry for [" + result.getName() + "] on class [" + result.getTestClass().getName() + "] Retry "
					+ retryCount + " times";
			logger.info(message);
			Reporter.setCurrentTestResult(result);
			Reporter.log("RunCount=" + (retryCount + 1));
			retryCount++;
			return true;
		}
		return false;
	}

	public static int getMaxRetryCount() {
		return maxRetryCount;
	}
	
	public int getRetryCount() {
		return retryCount;
	}
	
}
