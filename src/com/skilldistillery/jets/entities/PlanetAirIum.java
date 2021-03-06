package com.skilldistillery.jets.entities;

public class PlanetAirIum extends Jet implements PeopleTransport {

	public PlanetAirIum() {
	}

	public PlanetAirIum(String name, String model, int speed, int range, double price) {
		super(name, model, speed, range, price);
	}

	public String fly(String name, String model, int range, int speed, double price) {
		int flightTime = 0;
		flightTime = (range / speed);
		return "Ready to fly- Homeward! [Name: " + name + ", Model: " + model + ", Speed: " + speed + ", Range: "
				+ range + ", Price: " + price + ", Flight Time: " + flightTime + "]";
	}

	@Override
	public void loadPeople() {
		int passengers = 0;

		passengers = (int) (Math.random() * 100) + 1;
		System.out.println("All" + passengers + " have boarded and we are homeward bound!");

	}

}
