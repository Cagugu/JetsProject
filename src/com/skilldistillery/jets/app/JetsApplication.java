package com.skilldistillery.jets.app;

import java.util.List;
import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.ExpeditionAiry;
import com.skilldistillery.jets.entities.Jet;
import com.skilldistillery.jets.entities.JumpFlight;
import com.skilldistillery.jets.entities.PeopleTransport;

public class JetsApplication {

	Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		AirField af = new AirField();
		List<Jet> jetImport = af.getJetImport();
		
		System.out.println("WELCOME");
		System.out.println("Please enter 5: ");
		
		JetsApplication menuInstance = new JetsApplication();
		menuInstance.menu(menuInstance, jetImport);

	}

	private void menu(JetsApplication menuInstance, List<Jet> jetImport) {
		int userChoice = 0; 


		while(userChoice<10) {
		userChoice = kb.nextInt();
			System.out.println("Main Menu:");
			System.out.println("Please enter 9 to exit menu.");
			System.out.println("Enter 1 to: List the fleet: ");
			System.out.println("Enter 2 to: Fly the whole fleet: ");
			System.out.println("Enter 3 to: List fastest aircraft: ");
			System.out.println("Enter 4 to: List aircraft with longest range: ");
			System.out.println("Enter 5 to: Drop all Explorers");
		
		if(userChoice <9) {
		switch (userChoice) {
		case 1:
			menuInstance.listFleet(jetImport);
			break;
		case 2:
			menuInstance.flyAllJets(jetImport);
			break;
		case 3:
			Jet fastJet = menuInstance.getFastestJet(jetImport);
			System.out.println("The fastest of our fleet: " + fastJet);
			break;
		case 4:
			Jet hasLongestRange = menuInstance.getLongestRange(jetImport);
			System.out.println("Planning a longer voyage?" + hasLongestRange);
			break;
		case 5:
			menuInstance.dropAllExplorers(jetImport);
			break;
		case 6: 
		}
	}
		else {
			System.out.println("You have chosen to quit. See you next time!");
		}
		}
	}
	
	private List<Jet> buildYourOwn(List<Jet> jetImport) {
		
		
		
		return jetImport;
		
	}

	private void dropAllExplorers(List<Jet> jetImport) {
		
		for (int i = 0; i < jetImport.size(); i++) {
			if (jetImport.get(i) instanceof JumpFlight) {
				((JumpFlight) jetImport.get(i)).dropExplorers();;
				System.out.println();
			}
			
		}
		
	}
	private Jet getFastestJet(List<Jet> jetImport) {

		Jet fastJet = jetImport.get(0);
		for (int i = 0; i < jetImport.size(); i++) {
			Jet compare = jetImport.get(i);
			if (compare.getSpeed() > fastJet.getSpeed()) {
				fastJet = compare;
			}

		}
		return fastJet;
	}

	private Jet getLongestRange(List<Jet> jetImport) {

		Jet hasLongestRange = jetImport.get(0);
		for (int i = 0; i < jetImport.size(); i++) {
			Jet compare = jetImport.get(i);
			if (compare.getRange() > hasLongestRange.getRange()) {
				hasLongestRange = compare;
			}

		}
		return hasLongestRange;
	}


	private void flyAllJets(List<Jet> jetImport) {
		for (int i = 0; i <= 4; i++) {
			Jet jetInstance = jetImport.get(i);
			System.out.println(jetInstance.fly());
		}
	}

	private void listFleet(List<Jet> jetImport) {
		System.out.println(jetImport);
	}

}
