package com.skilldistillery.jets.entities;

public class PlanetAirIum extends Jet implements PeopleTransport{


	public PlanetAirIum() {
	}
	
	public PlanetAirIum(String name, String model, int speed, int range, double price) {
		super(name, model, speed, range, price);	
	}

	@Override
	public void loadPeople() {
		// TODO Auto-generated method stub
		
	}


	
}
