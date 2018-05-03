package com.inheritance.vehicle;

public class TestVehicle {
	
	public static void main(String[] args) {
		
		Car c= new Car();
		c.brand = "Audi";
		c.color = "White";
		c.isAcPresent = true;
		c.noOfSeatbelts = 4;
		c.price = 8500000;
		c.noOfWheels = 4;
		c.move();
		c.start();
		c.stop();
		c.temperatureControl();
		
	}

}
