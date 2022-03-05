package com.skilldistillery.jets.entities;

public class LogisticianShip extends Jet implements SupplyDropper {

	
	public LogisticianShip() {}
	
	public LogisticianShip(String name, String model, int speed, int range, double price) {
		super(name, model, speed, range, price);
		
	}
	

	@Override
	public void dropResupply() {
		// TODO Auto-generated method stub
	}
}
