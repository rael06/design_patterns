package infotel.perso.decorators.model.decorators;

import infotel.perso.decorators.model.boissons.Boisson;
import infotel.perso.decorators.model.exceptions.TailleBoissonInconnueError;

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
