package com.skilldistillery.jets.entities;

public class LogisticianShip extends Jet implements SupplyDropper {

	public LogisticianShip() {
	}

	public LogisticianShip(String name, String model, int speed, int range, double price) {
		super(name, model, speed, range, price);

	}

	public String fly(String name, String model, int range, int speed, double price) {
		int flightTime = 0;
		flightTime = (range / speed);
		return "Ready to fly! Incoming suppy drop! [Name: " + name + ", Model: " + model + ", Speed: " + speed
				+ ", Range: " + range + ", Price: " + price + ", Flight Time: " + flightTime + "]";
	}

	@Override
	public void dropResupply() {
		int amountOfSupplies = 0;

		amountOfSupplies = (int) (Math.random() * 100) + 1;
		System.out.println("Supply drop inbound! " + amountOfSupplies + ": lbs. of supplies drop in your area.");
	}

}
