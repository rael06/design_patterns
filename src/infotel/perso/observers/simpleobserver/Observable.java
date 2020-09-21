package infotel.perso.observers.simpleobserver;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
	protected List<Observer> observers = new ArrayList<>();
	
	public void addObserver(Observer observer) {
		observers.add(observer);
	}
	
	protected abstract void notifyObservers();
}
