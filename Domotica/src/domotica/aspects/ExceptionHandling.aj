package domotica.aspects;

import domotica.model.*;

public aspect ExceptionHandling {
	
	private pointcut executions(): within(domotica.model.*) && execution(* *(..));
	
	private pointcut topExecutions(): executions() && !cflowbelow(executions());
	
	after() throwing(GasException e): topExecutions() {
		System.err.println("klacht verstuurd naar leverancier van gas: " + thisJoinPoint);     
    }
	
	after() throwing(WaterException e): topExecutions() {
		System.err.println("klacht verstuurd naar gemeente: " + thisJoinPoint);     
    }
	
	after() throwing(ElectricityException e): topExecutions() {
		System.err.println("klacht verstuurd naar leverancier van elektriciteit: " + thisJoinPoint);     
    }
	
}
