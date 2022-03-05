package com.skilldistillery.jets.entities;

public class ExpeditionAiry extends Jet implements JumpFlight {

	
	public ExpeditionAiry() {}
	
	public ExpeditionAiry(String name, String model, int speed, int range, double price) {
		super(name, model, speed, range, price);
		
	}
	
	@Override
	public void dropExplorers() {
		// TODO Auto-generated method stub
		
	}

}
