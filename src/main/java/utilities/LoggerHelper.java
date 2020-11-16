package utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerHelper {

	private static boolean root = false;
	//private static final Logger logger = LogManager.getLogger(LoggerHelper.class);
	
	public static Logger loadLogger(Class cls) {
		if(root) {
			return LogManager.getLogger(cls);
		}
		root=true;
		return LogManager.getLogger(cls);
	}

    public static void main(String[] args) {

    	Logger logger = LogManager.getLogger(LoggerHelper.class);
        logger.trace("Trace Message!");
        logger.debug("Debug Message!");
        logger.info("Info Message!");
        logger.warn("Warn Message!");
        logger.error("Error Message!");
        logger.fatal("Fatal Message!");
		//logger.error("And here comes the Error Message!", new RuntimeException("RunRunRun"));

    }

}
