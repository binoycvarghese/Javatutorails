package com.java.training.oops;

interface IVehicle {

	void move() ;

}

class Scooter implements IVehicle {
	public void move() { // Dynamic polymorphism 
		System.out.println("This is from Scooter");
	}

	public void move(Integer speed) { // Static polymorphism 
		System.out.println("This is from Scooter");
	}
}

class Cycle implements IVehicle {
	public void move() { // Dynamic polymorphism 
		System.out.println("This is from Cycle");
	}

	public void move(Integer speed) { // Static polymorphism 
		System.out.println("This is from Cylce");
	}
}

class TestVehicle {
	public static void main(String[] args) {
		IVehicle vh = new Scooter();
		vh.move(); // This is from Scooter
		vh = new Cycle();
		vh.move(); // This is from Cycle
	}
}
