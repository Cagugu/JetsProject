package com.skilldistillery.jets.entities;

public class ExpeditionAiry extends Jet implements JumpFlight {

	
	public ExpeditionAiry() {}
	
	public ExpeditionAiry(String name, String model, int speed, int range, double price) {
		super(name, model, speed, range, price);
		
	}
	
	
	public String fly(String name, String model, int range, int speed, double price) {
		int flightTime = 0;
		flightTime = (range/speed);
		return "Ready to fly! Explorers inbound! [Name: " + name + ", Model: " + model + ", Speed: " + speed + ", Range: " + range + ", Price: " + price
				 + ", Flight Time: " + flightTime + "]";
	}

	
	@Override
	public void dropExplorers() {
		int explorers = 0;

		explorers = (int) (Math.random() * 100) + 1;
		System.out.println("All " + explorers + " explorers have been dropped on Planet X.");

	}



}
