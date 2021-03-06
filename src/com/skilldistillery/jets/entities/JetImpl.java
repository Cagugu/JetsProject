package com.skilldistillery.jets.entities;

public class JetImpl extends Jet {

	public JetImpl() {
		super();
	}

	public JetImpl(String name, String model, int speed, int range, double price) {
		super(name, model, speed, range, price);
	}

	public String fly(String name, String model, int range, int speed, double price) {
		int flightTime = 0;
		flightTime = (range / speed);
		return "Ready to fly! Explorers inbound! [Name: " + name + ", Model: " + model + ", Speed: " + speed
				+ ", Range: " + range + ", Price: " + price + ", Flight Time: " + flightTime + "]";
	}

	public String getSpeed(String speed) {
		return speed;
	}

}
