package domotica.aspects;

import java.io.*;
import java.util.logging.*;
import org.aspectj.lang.*;

public aspect LogFieldSets {

	private pointcut fieldSets() : within(domotica.model.*) && set(* *);

	private Logger logger;
		
	public LogFieldSets() {
		try {
			logger = Logger.getAnonymousLogger();
			logger.setUseParentHandlers(false);
			logger.setLevel(Level.ALL);
			Handler handler = new FileHandler("logging/logging.txt");
			handler.setFormatter(new SimpleFormatter());
			handler.setLevel(Level.ALL);
			logger.addHandler(handler);
		} catch (IOException e) {
			System.exit(-1);
		}
	}
	
	after() : fieldSets() {
		Signature sig = thisJoinPoint.getSignature();
		String message = thisJoinPoint.getThis() + "." + sig.getName() + " = " + thisJoinPoint.getArgs()[0];
		logger.info(message);        
    }
}
