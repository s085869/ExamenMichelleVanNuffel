package domotica.state;

public class HighTempState implements AircoState{
	
	AircoTemperature airco;
	
	public HighTempState(AircoTemperature airco){
		this.airco = airco;
	}
	
	@Override
	public void higherTemperature() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lowerTemperature() {
		// TODO Auto-generated method stub
		
	}

}
