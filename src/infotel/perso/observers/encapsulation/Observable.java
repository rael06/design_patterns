package infotel.perso.observers.encapsulation;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable<T> {
	protected List<Observer<T>> observers = new ArrayList<>();
	
	public void addObserver(Observer<T> observer) {
		observers.add(observer);
	}
	
	protected abstract void notifyObservers();
}
