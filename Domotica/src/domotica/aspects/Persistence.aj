package domotica.aspects;

import java.io.*;

import domotica.model.*;

public aspect Persistence {

	private pointcut fieldSets() : within(domotica.model.*) && set(* *);

	after() : fieldSets() {
		if (thisJoinPoint.getThis() instanceof DomoticaObject) {
			DomoticaObject domoticaObject = (DomoticaObject) thisJoinPoint.getTarget();
			save(domoticaObject);
		}
	}	

	public void save(DomoticaObject domoticaObject) {
		ObjectOutputStream out = null;
		try { 
			out = new ObjectOutputStream(new FileOutputStream("persistence/" + domoticaObject.getId()));
			out.writeObject(domoticaObject);
			out.flush();
			out.close();
		} catch (IOException e) {	
			throw new RuntimeException(e); 
		} 
	}
	
}
