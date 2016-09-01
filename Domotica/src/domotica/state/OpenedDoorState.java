package domotica.state;

public class OpenedDoorState implements DoorState{

	DoorsClosed door;
	
	public OpenedDoorState(DoorsClosed door){
		this.door = door;
	}
	
	@Override
	public void openDoor() {
		System.out.println("The door is already open!");		
	}

	@Override
	public void closeDoor() {
		System.out.println("Closing the door ...");	
	}
	
}
