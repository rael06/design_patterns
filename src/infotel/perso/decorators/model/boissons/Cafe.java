package infotel.perso.decorators.model.boissons;

public class Cafe extends Boisson {

	private static final String DESCRIPTION = "Cafe";
	private static final double COUT = 2.3;

	public Cafe() {
		description = DESCRIPTION;
	}

	@Override
	public double cout() {
		return COUT;
	}

}
