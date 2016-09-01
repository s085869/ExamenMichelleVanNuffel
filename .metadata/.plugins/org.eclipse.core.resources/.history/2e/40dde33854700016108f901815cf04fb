package domotica.state;

public class DoorsClosed {
	private DoorState openState;
	private DoorState closedState;
	
	private DoorState state = closedState;
	
	public DoorsClosed(){
		openState = new OpenedDoorState(this);
		closedState = new ClosedDoorState(this);
	}
	
	public void openDoor(){
		state.openDoor();
	}
	
	public void closeDoor(){
		state.closeDoor();
	}

	public DoorState getOpenState() {
		return openState;
	}

	public DoorState getClosedState() {
		return closedState;
	}

	public DoorState getState() {
		return state;
	}

	public void setState(DoorState state) {
		this.state = state;
	}
	
	
}
