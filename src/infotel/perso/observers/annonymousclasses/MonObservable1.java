package infotel.perso.observers.annonymousclasses;

public class MonObservable1 extends Observable<MonObservable1> {

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
