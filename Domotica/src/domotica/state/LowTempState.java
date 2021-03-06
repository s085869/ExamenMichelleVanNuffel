package domotica.state;

public class LowTempState implements AircoState{
	
	AircoTemperature airco;
	
	public LowTempState(AircoTemperature airco){
		this.airco = airco;
	}
	
	@Override
	public void higherTemperature() {
		airco.setState(airco.getMidState());
		System.out.println("Highering temperature ...");		
	}

	@Override
	public void lowerTemperature() {
		System.out.println("Coldest temperature reached!");
		
	}

}
