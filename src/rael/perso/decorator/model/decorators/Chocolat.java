package rael.perso.decorator.model.decorators;

import rael.perso.decorator.model.boissons.Boisson;
import rael.perso.decorator.model.exceptions.TailleBoissonInconnueError;

public class Chocolat extends DecorateurIngredient {

	private static final String DESCRIPTION = "Chocolat";
	private static final double COUT_PETIT = 0.85;
	private static final double COUT_MOYEN = 1.2;
	private static final double COUT_GRAND = 1.45;

	public Chocolat(Boisson boisson) {
		super(boisson);
	}

	@Override
	public double cout() throws TailleBoissonInconnueError {
		switch (taille) {
		case PETIT:
			return COUT_PETIT + boisson.cout();
		case MOYEN:
			return COUT_MOYEN + boisson.cout();
		case GRAND:
			return COUT_GRAND + boisson.cout();
		default:
			throw new TailleBoissonInconnueError();
		}
	}

	@Override
	public String getDescription() {
		return boisson.getDescription() + " " + DESCRIPTION;
	}

}
