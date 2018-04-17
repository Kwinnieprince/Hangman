package db;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import domain.WoordenLijst;

/*
 
 		Om lezer te gebruiken vvvvvv
 
		WoordenLezer lezer = new WoordenLezer("hangman");
		WoordenLijst lijst = lezer.Lees();
		
		System.out.println(lijst.getRandomWoord()); 
 */

public class WoordenLezer {
	File file;
	Scanner scanner;
	
	public WoordenLezer(String bestandsNaam) {
		bestandsNaam+=".txt";
		file = new File(bestandsNaam);
		try {
			scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			throw new DbException("Geen bestand met naam \"" + bestandsNaam + "\" gevonden!" + e);
		}
	}
	
	public WoordenLijst Lees() {
		WoordenLijst lijst = new WoordenLijst();

         while (scanner.hasNextLine()) {
             String line = scanner.nextLine();
             lijst.voegToe(line);
         }
         scanner.close();
		
		return lijst;
	}
}
