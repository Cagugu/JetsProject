package com.skilldistillery.jets.app;

import java.util.List;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.Jet;

public class JetsApplication {

	public static void main(String[] args) {
	
	AirField af = new AirField();
	List<Jet> jetImport = af.getJetImport();	
	System.out.println(jetImport);
	}



	
	
	
}
