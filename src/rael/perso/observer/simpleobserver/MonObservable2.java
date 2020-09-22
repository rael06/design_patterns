package rael.perso.observer.simpleobserver;

public class MonObservable2 extends Observable {

	private String name;
	
	public MonObservable2(String name) {
		this.name = name;
	}
	
	public void event() {
		notifyObservers();
	}

	public String getName() {
		return name;
	}

	@Override
	protected void notifyObservers() {
		observers.forEach(o->o.update(this));
	}
}
