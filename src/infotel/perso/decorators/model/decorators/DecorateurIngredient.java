package infotel.perso.decorators.model.decorators;

import infotel.perso.decorators.model.boissons.Boisson;

public abstract class DecorateurIngredient extends Boisson {
	Boisson boisson;
	protected DecorateurIngredient(Boisson boisson){
		this.boisson = boisson;
		taille = boisson.getTaille();
	}
	public abstract String getDescription();
}
