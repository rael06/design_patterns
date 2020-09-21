package infotel.perso.decorators.model.boissons;

import infotel.perso.decorators.model.exceptions.TailleBoissonInconnueError;

public abstract class Boisson {
	private static final Taille DEFAULT_TAILLE = Taille.PETIT;

	protected String description = "Boisson inconnue";
	protected Taille taille = DEFAULT_TAILLE;

	public String getDescription() {
		return description;
	}

	public Taille getTaille() {
		return taille;
	}

	public void setTaille(Taille taille) {
		this.taille = taille;
	}

	public String getTailleText() {
		String text = taille.toString();
		return text.substring(0, 1).toUpperCase() + text.substring(1).toLowerCase();
	}

	public abstract double cout() throws TailleBoissonInconnueError;

}
