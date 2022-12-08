package com.ques2;

public class Room {
	public int roomNumber ;
	public String roomType ;
	public int acfacility;
	public int roomarea;
	public int roomprice;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	


	public int getRoomNumber() {
		return roomNumber;
	}


	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}


	public String getRoomType() {
		return roomType;
	}


	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}


	public int getacfacility() {
		return acfacility;
	}


	public void setacfacility(int acfacility) {
		this.acfacility = acfacility;
	}
	
	
	public void displayRoom() {
	      System.out.println("Room Number: " + roomNumber + ", type: " + roomType + ", size: " + roomSize + ".");
	}
}


public class extends Room{
	
	public String guestName;
	private int roomGuests;
	private boolean ensuite;
	private int roomRate;

	public HotelRoom(int roomNumber, int roomSize, String roomType) { 
			
	}

	private String getGuestName() {
		return guestName;
	}

	private void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	private int getRoomGuests() {
		return roomGuests;
	}

	private void setRoomGuests(int roomGuests) {
		this.roomGuests = roomGuests;
	}

	private boolean getEnsuite() {
		return ensuite;
	}

	private void setEnsuite(boolean ensuite) {
		this.ensuite = ensuite;
	}

	private int getRoomRate() {
		return roomRate;
	}

	private void setRoomRate(int roomRate) {
		this.roomRate = roomRate;
	}

	public static void main(String[] args) {
		
		@override
		public void displayRoom() {
		      System.out.println("Guests Name: " + guestName + ", Amount of people staying: " + roomGuests + ", ensuite " + ensuite + ".");
		}	

	}

}
}