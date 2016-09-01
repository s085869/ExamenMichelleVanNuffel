package domotica.aspects;

import domotica.model.*;

public aspect Observing {

	private pointcut fieldSets() : within(domotica.model.*) && set(* *);

	after() : fieldSets() {
		if (thisJoinPoint.getThis() instanceof DomoticaObject) {
			DomoticaObject domoticaObject = (DomoticaObject) thisJoinPoint.getTarget();
			domoticaObject.setChanged();
			domoticaObject.notifyObservers();
		}
	}

}
