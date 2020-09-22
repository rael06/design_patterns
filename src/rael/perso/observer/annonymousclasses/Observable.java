package rael.perso.observer.annonymousclasses;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable<T> {
	protected List<ObserverImp<T>> observers = new ArrayList<>();
	
	public void addObserver(ObserverImp<T> observer) {
		observers.add(observer);
	}
	
	protected abstract void notifyObservers();
}
