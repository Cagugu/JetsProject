package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirField {
	Scanner kb = new Scanner(System.in);

	public AirField() {
		this.getFromFile(filename);
	}

	String filename = "jets.txt";
	List<Jet> jetImport = new ArrayList<>();

	private List<Jet> getFromFile(String filename) {
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
				} else {
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

	public List<Jet> buildYourOwn() {
		System.out.println("Please provide a name for your Jet: ");
		String name = kb.next();
		System.out.println("Please provide a model for your Jet: ");
		String model = kb.next();
		System.out.println("Please provide a speed in MPH for your Jet: ");
		int speed = kb.nextInt();
		System.out.println("Please provide a travel range for your Jet: ");
		int range = kb.nextInt();
		System.out.println("Please provide a price for your Jet: ");
		double price = kb.nextDouble();

		Jet userJet = new JetImpl(name, model, speed, range, price);
		jetImport.add(userJet);

		return jetImport;

	}

	public List<Jet> removeJetFromFleet() {
		System.out.println("Please provide enter the number of the jet you'd like to remove: ");
		for (int i = 0; i < jetImport.size(); i++) {
			Jet jetInstance = jetImport.get(i);
			System.out.println(i +  ": " + jetInstance.toString());
		}
		int r = kb.nextInt();
		jetImport.remove(r);

		return jetImport;
	}

	public void dropAllExplorers() {

		for (int i = 0; i < jetImport.size(); i++) {
			if (jetImport.get(i) instanceof JumpFlight) {
				((JumpFlight) jetImport.get(i)).dropExplorers();
				;
				System.out.println();
			}

		}

	}

	public void dropResupply() {

		for (int i = 0; i < jetImport.size(); i++) {
			if (jetImport.get(i) instanceof SupplyDropper) {
				((SupplyDropper) jetImport.get(i)).dropResupply();
				;
				System.out.println();
			}

		}

	}

	public void getFastestJet() {

		Jet fastJet = jetImport.get(0);
		for (int i = 0; i < jetImport.size(); i++) {
			Jet compare = jetImport.get(i);
			if (compare.getSpeed() > fastJet.getSpeed()) {
				fastJet = compare;
			}
		}
		System.out.println("The fastest of our fleet: " + fastJet);

	}

	public void getLongestRange() {

		Jet hasLongestRange = jetImport.get(0);
		for (int i = 0; i < jetImport.size(); i++) {
			Jet compare = jetImport.get(i);
			if (compare.getRange() > hasLongestRange.getRange()) {
				hasLongestRange = compare;
			}

		}
		System.out.println("Planning a longer voyage?" + hasLongestRange);
	}

	public void flyAllJets() {
		for (int i = 0; i < jetImport.size(); i++) {
			Jet jetInstance = jetImport.get(i);
			System.out.println(jetInstance.fly());
		}
	}

	public void listFleet() {
		for (int i = 0; i < jetImport.size(); i++) {
			Jet jetInstance = jetImport.get(i);
			System.out.println(jetInstance.toString());
		}
	}

}
