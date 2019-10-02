package com.java.training.oops;

class Vehicle {

	public void move() {
		System.out.println("This is from Vehicle");
	}

}

class Bike extends Vehicle {
	public void move() { // Dynamic polymorphism 
		System.out.println("This is from Bike");
	}

	public void move(Integer speed) { // Static polymorphism 
		System.out.println("This is from Bike");
	}
}

class TestClazz {
	public static void main(String[] args) {
		Vehicle vh = new Bike();
		vh.move(); // This is from Bike
		vh = new Vehicle();
		vh.move(); // This is from Vehicle
	}
}
