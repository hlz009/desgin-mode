package com.xiaozhi.designMode.responsibilityChain;
/**
 * 创建不同类型的记录器。赋予它们不同的错误级别，并在每个记录器中设置下一个记录器。
 * 每个记录器中的下一个记录器代表的是链的一部分。
 * @author xiaozhi009
 *
 */
public class ChainPatternDemo {
	
	private static AbstractLogger getChainOfLoggers() {
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
		
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);

		return errorLogger;
	}

	public static void main(String[] args) {
	    AbstractLogger loggerChain = getChainOfLoggers();
	 
	    // 输出1条
	    loggerChain.logMessage(AbstractLogger.INFO, 
	        "This is an information.");
	 
	    // 输出2条
	    loggerChain.logMessage(AbstractLogger.DEBUG, 
	        "This is an debug level information.");

	    // 输出3条
	    loggerChain.logMessage(AbstractLogger.ERROR, 
	        "This is an error information.");
	   }
}
