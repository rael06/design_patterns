package infotel.perso.decorators;

import infotel.perso.decorators.model.boissons.Boisson;
import infotel.perso.decorators.model.boissons.Cafe;
import infotel.perso.decorators.model.boissons.Taille;
import infotel.perso.decorators.model.decorators.Chantilly;
import infotel.perso.decorators.model.decorators.Chocolat;
import infotel.perso.decorators.model.exceptions.TailleBoissonInconnueError;

public class Main {
	public static void main(String[] args) {
		Boisson boisson1 = new Cafe();
		boisson1.setTaille(Taille.INCONNUE);
		boisson1 = new Chantilly(boisson1);
		boisson1 = new Chocolat(boisson1);
		boisson1 = new Chocolat(boisson1);
		
		Boisson boisson2 = new Cafe();
		boisson2.setTaille(Taille.GRAND);
		boisson2 = new Chantilly(boisson2);
		boisson2 = new Chocolat(boisson2);
		boisson2 = new Chocolat(boisson2);
		
		Boisson boisson3 = new Cafe();
		boisson3 = new Chantilly(boisson3);
		boisson3 = new Chocolat(boisson3);
		

		print(boisson1);
		print(boisson2);
		print(boisson3);
	}
	
	public static void print(Boisson boisson) {
		try {
			System.out.println(boisson.getTailleText() + " " + boisson.getDescription() + ", prix : " + boisson.cout() + " euros");
		} catch (TailleBoissonInconnueError e) {
			e.printStackTrace();
		}
	}
}
