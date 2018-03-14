package com.shantanu.composite;

public class Program {
	public static void main(String[] args) {
		
    Housing building = new Housing(" Road 01  , Baridhara Dhaka");
		Housing floor1 = new Housing("Road 01  , Baridhara Dhaka - First Floor");
		int firstFloor = building.addStructure(floor1);

		Room washRoom1m = new Room("Mens Washroom");
		Room washRoom1f = new Room("Female's Washroom");
		Room commonRoom = new Room("Common Room");

		int firstMan = floor1.addStructure(washRoom1m);
		int firstFemale = floor1.addStructure(washRoom1f);
		int common = floor1.addStructure(commonRoom);

		building.enter();
		Housing currentFloor = (Housing) building.getStructures(firstFloor);
		currentFloor.enter();
		Room currentRoom = (Room) currentFloor.getStructures(firstMan);
		currentRoom.enter();
		currentRoom = (Room) currentFloor.getStructures(common);
		currentRoom.enter();
	}
}
