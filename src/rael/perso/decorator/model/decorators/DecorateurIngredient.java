package rael.perso.decorator.model.decorators;

import rael.perso.decorator.model.boissons.Boisson;

public abstract class DecorateurIngredient extends Boisson {
	Boisson boisson;
	protected DecorateurIngredient(Boisson boisson){
		this.boisson = boisson;
		taille = boisson.getTaille();
	}
	public abstract String getDescription();
}
