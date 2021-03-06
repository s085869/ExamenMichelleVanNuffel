package domotica.state;

public class MidTempState implements AircoState{
	
	AircoTemperature airco;
	
	public MidTempState(AircoTemperature airco){
		this.airco = airco;
	}
	
	@Override
	public void higherTemperature() {
		airco.setState(airco.getHighState());
		System.out.println("Highering temperature ...");
		
	}

	@Override
	public void lowerTemperature() {
		airco.setState(airco.getLowState());
		System.out.println("Lowering temperature ...");
		
	}

}
