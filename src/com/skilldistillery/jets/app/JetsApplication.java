package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;

public class JetsApplication {

	Scanner kb;
	private AirField af;

	public static void main(String[] args) {

		JetsApplication menuInstance = new JetsApplication();
		menuInstance.launch();

	}

	private void launch() {
		af = new AirField();
		menu();
	}

	private void menu() {
		kb = new Scanner(System.in);
		int userChoice = 0;

		while (userChoice != 9) {

			System.out.println();
			System.out.println("Main Menu:");
			System.out.println("Please enter 9 to exit menu.");
			System.out.println("Enter 1 to: List the fleet: ");
			System.out.println("Enter 2 to: Fly the whole fleet: ");
			System.out.println("Enter 3 to: List fastest aircraft: ");
			System.out.println("Enter 4 to: List aircraft with longest range: ");
			System.out.println("Enter 5 to: Drop all Explorers: ");
			System.out.println("Enter 6 to: Call in all available supply drops: ");
			System.out.println("Enter 7 to: Add a new aircraft to the fleet: ");
			System.out.println("Enter 8 to: Remove aircraft from fleet: ");

			userChoice = kb.nextInt();

				switch (userChoice) {
				case 1:
					af.listFleet();
					break;
				case 2:
					af.flyAllJets();
					break;
				case 3:
					af.getFastestJet();
					break;
				case 4:
					af.getLongestRange();
					break;
				case 5:
					af.dropAllExplorers();
					break;
				case 6:
					af.dropResupply();
					break;
				case 7:
					af.buildYourOwn();
					break;
				case 8:
					af.removeJetFromFleet();
					break;

				}
		if (userChoice == 9) {
			System.out.println("You have chosen to quit. See you next time!");
			break;
		}
		}
		kb.close();
	}
}
