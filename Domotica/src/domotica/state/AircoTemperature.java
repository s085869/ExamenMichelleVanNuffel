package domotica.state;

public class AircoTemperature {
	private AircoState lowState;
	private AircoState midState;
	private AircoState highState;
	
	private AircoState state = lowState;
	
	public AircoTemperature(){
		lowState = new LowTempState(this);
		midState = new MidTempState(this);
		highState = new HighTempState(this);
	}
	
	public AircoState getLowState(){
		return lowState;
	}
	
	public AircoState getMidState(){
		return midState;
	}
	
	public AircoState getHighState(){
		return highState;
	}
	
	public AircoState getState(){
		return state;
	}
	
	public void setState(AircoState state) {
		this.state = state;
	}
	
	public void higherTemperature(){
		state.higherTemperature();
	}
	
	public void lowerTemperature(){
		state.lowerTemperature();
	}
}
