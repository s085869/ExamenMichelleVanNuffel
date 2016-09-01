package domotica.aspects;

import java.io.*;
import java.util.logging.*;
import org.aspectj.lang.*;

public aspect Tracing {

	private pointcut executions(): within(domotica.model.*) && (execution(new(..)) || execution(* *(..)));
	
	private Logger logger;
	
	public Tracing() {
		try {
			logger = Logger.getAnonymousLogger();
			logger.setUseParentHandlers(false);
			logger.setLevel(Level.ALL);
			Handler handler = new FileHandler("tracing/tracing.xml");
			handler.setFormatter(new XMLFormatter());
			handler.setLevel(Level.ALL);
			logger.addHandler(handler);
		} catch (IOException e) {
			System.exit(-1);
		}
	}
	
	before() : executions() {
		Signature signature = thisJoinPoint.getSignature();
		String sourceClass = signature.getDeclaringTypeName();
		String sourceMethod = signature.getName();
		Object[] params = thisJoinPoint.getArgs();
		logger.entering(sourceClass,sourceMethod,params);
	}

	after() : executions() {
		Signature signature = thisJoinPoint.getSignature();
		String sourceClass = signature.getDeclaringTypeName();
		String sourceMethod = signature.getName();
		logger.exiting(sourceClass,sourceMethod);
	}

}
