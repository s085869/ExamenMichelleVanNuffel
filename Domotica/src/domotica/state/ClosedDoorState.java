package domotica.state;

public class ClosedDoorState implements DoorState{

	DoorsClosed door;
	
	public ClosedDoorState(DoorsClosed door){
		this.door = door;
	}
	
	@Override
	public void openDoor() {
		door.setState(door.getOpenState());
		System.out.println("Opening the door ...");
	}

	@Override
	public void closeDoor() {
		System.out.println("The door is already closed!");
	}

}
