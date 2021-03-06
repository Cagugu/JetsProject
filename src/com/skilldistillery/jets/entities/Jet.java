package com.skilldistillery.jets.entities;

import java.util.Objects;

public abstract class Jet {

	private String name;
	private String model;
	private int speed = 0;
	private int range = 0;
	private double price = 0.0;

	public Jet() {
	}

	public Jet(String name, String model, int speed, int range, double price) {
		this.name = name;
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public String toString() {
		return "Jet [Name: " + name + ", Model: " + model + ", Speed: " + speed + ", Range: " + range + ", Price: "
				+ price + "]";
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String fly() {
		int flightTime = 0;
		flightTime = (range / speed);
		return "Ready to fly! [Name: " + name + ", Model: " + model + ", Speed: " + speed + ", Range: " + range
				+ ", Price: " + price + ", Flight Time: " + flightTime + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(model, price, range, speed);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jet other = (Jet) obj;
		return Objects.equals(model, other.model)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && range == other.range
				&& speed == other.speed;
	}

}
