package domotica.state;

public class HighTempState implements AircoState{
	
	AircoTemperature airco;
	
	public HighTempState(AircoTemperature airco){
		this.airco = airco;
	}
	
	@Override
	public void higherTemperature() {
		System.out.println("Highest temperature reached!");
		
	}

	@Override
	public void lowerTemperature() {
		airco.setState(airco.getMidState());
		System.out.println("Lowering temperature ...");
		
	}

}
