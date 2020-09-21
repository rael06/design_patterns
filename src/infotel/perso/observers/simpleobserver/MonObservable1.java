package infotel.perso.observers.simpleobserver;

public class MonObservable1 extends Observable {

	private String name;
	
	public MonObservable1(String name) {
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
