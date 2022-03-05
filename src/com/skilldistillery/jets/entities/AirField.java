package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {

	public AirField() {
		super();
		getFromFile(filename);
	}

	String filename = "jets.txt";

	List<Jet> jetImport = new ArrayList<>();

	public List<Jet> getFromFile(String filename) {
		String lineFromFile;
		
		Jet jet = null;
		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {

			while ((lineFromFile = bufIn.readLine()) != null) {
				String[] sepAttributes = lineFromFile.split(",");

				if (lineFromFile.contains("ExpeditionAiry")) {
					String name = sepAttributes[0];
					String model = sepAttributes[1];
					int speed = Integer.parseInt(sepAttributes[2]);
					int range = Integer.parseInt(sepAttributes[3]);
					double price = Double.parseDouble(sepAttributes[4]);
					jet = new ExpeditionAiry(name, model, speed, range, price);
				} else if (lineFromFile.contains("LogisticianShip")) {
					String name = sepAttributes[0];
					String model = sepAttributes[1];
					int speed = Integer.parseInt(sepAttributes[2]);
					int range = Integer.parseInt(sepAttributes[3]);
					double price = Double.parseDouble(sepAttributes[4]);
					jet = new LogisticianShip(name, model, speed, range, price);
				} else if (lineFromFile.contains("PlanetAirIum")) {
					String name = sepAttributes[0];
					String model = sepAttributes[1];
					int speed = Integer.parseInt(sepAttributes[2]);
					int range = Integer.parseInt(sepAttributes[3]);
					double price = Double.parseDouble(sepAttributes[4]);
					jet = new PlanetAirIum(name, model, speed, range, price);
				}
				else {
					String name = sepAttributes[0];
					String model = sepAttributes[1];
					int speed = Integer.parseInt(sepAttributes[2]);
					int range = Integer.parseInt(sepAttributes[3]);
					double price = Double.parseDouble(sepAttributes[4]);
					jet = new JetImpl(name, model, speed, range, price);
				}
				
				jetImport.add(jet);

			}
		} catch (IOException e) {
			System.err.println(e);
		}
		return jetImport;

	}

	public List<Jet> getJetImport() {
		return jetImport;
	}

	public void setJetImport(List<Jet> jetImport) {
		this.jetImport = jetImport;
	}

	public List<Jet> listFleet(List<Jet> jetImport) {

		return jetImport;
	}

}
