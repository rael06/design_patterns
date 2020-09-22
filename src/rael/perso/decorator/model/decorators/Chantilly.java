package rael.perso.decorator.model.decorators;

import rael.perso.decorator.model.boissons.Boisson;
import rael.perso.decorator.model.exceptions.TailleBoissonInconnueError;

public class Chantilly extends DecorateurIngredient {

	private static final String DESCRIPTION = "Chantilly";
	private static final double COUT = 0.5;

	public Chantilly(Boisson boisson) {
		super(boisson);
	}

	@Override
	public double cout() throws TailleBoissonInconnueError {
		return COUT + boisson.cout();
	}

	@Override
	public String getDescription() {
		return boisson.getDescription() + " " + DESCRIPTION;
	}

}
