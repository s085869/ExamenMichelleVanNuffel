package domotica.test;

import domotica.model.*;

public aspect TestHelp {

	void around () : call(void Room+.set*(..)) && within(domotica.test.Test) {
		try {
			proceed();
		} catch (DomoticaException e) {
			//	do nothing
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
		
}
