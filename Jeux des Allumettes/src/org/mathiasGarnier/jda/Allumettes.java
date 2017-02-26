package org.mathiasGarnier.jda;

import java.util.Random;
import java.util.Scanner;

public class Allumettes {

    private static int NB_ALLUMETTE = 15;
    private static int choice;
    
    
    public Allumettes() {
	
    }
    
    private void init() {
	
	System.out.println("Bienvenue au Jeux Des Allumettes.\n"
		+ "Comment jouer ?\n"
		+ "\tVous jouez contre l\'ordinateur et retirez tour � tour 1 � 3 allumettes. Celui qui retire la derni�re allumette gagne.");
    }
    
    private void choice() {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Vous d�cidez de tirer 1, 2 ou 3 allumettes ?");
	choice = sc.nextInt();
	
	switch (choice) {
	
	case 1:
	    
	    NB_ALLUMETTE -= 1;
	    
	    System.out.println("Il ne reste plus que " + NB_ALLUMETTE + " allumettes.");

	    break;
	    
	case 2:
	    
	    NB_ALLUMETTE -= 2;
	    
	    System.out.println("Il ne reste plus que " + NB_ALLUMETTE + " allumettes.");

	    break;
	    
	case 3:
	    
	    NB_ALLUMETTE -= 3;
	    
	    System.out.println("Il ne reste plus que " + NB_ALLUMETTE + " allumettes.");
	    
	    break;
	    
	    default:
		
		System.out.println("Veuillez r�essayer.");
		choice();
		
		break;
	}
    }

    private void aiChoice() {
	
	Random r = new Random();
	int randNum = r.nextInt(4) + 1;
	
	switch (randNum) {
	
	case 1:
	    
	    NB_ALLUMETTE -= 1;
	    
	    System.out.println("Il ne reste plus que " + NB_ALLUMETTE + " allumettes.");

	    break;
	    
	case 2:
	    
	    NB_ALLUMETTE -= 2;
	    
	    System.out.println("Il ne reste plus que " + NB_ALLUMETTE + " allumettes.");

	    break;
	    
	case 3:
	    
	    NB_ALLUMETTE -= 3;
	    
	    System.out.println("Il ne reste plus que " + NB_ALLUMETTE + " allumettes.");
	    
	    break;
	    
	    default:
		
		System.out.println("Veuillez r�essayer.");
		choice();
		
		break;
	}
    }
    
    public void newGame() {

	init();

	while (NB_ALLUMETTE > 1) {
	    
	    choice();
	    if (NB_ALLUMETTE  <= 1) {
		
		System.out.println("JOUEUR -> GAGNER");
		break;
	    }
	    aiChoice();
	    if (NB_ALLUMETTE <= 1) {
		
		System.out.println("IA -> GAGNER");
		break;
	    }
	}
    }
}
