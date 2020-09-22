package rael.perso.observer.encapsulation;

public class Main {

	public static void main(String[] args) {
		
		// observers
		MonObserver1 monObserver1 = new MonObserver1();
		MonObserver2 monObserver2 = new MonObserver2();
		
		
		// observables
		MonObservable1 observable1 = new MonObservable1("Observable 1");
		MonObservable2 observable2 = new MonObservable2("Observable 2");
		
		
		//subscribing
		observable1.addObserver(monObserver1.getObserverOfMonObservable1());
		observable2.addObserver(monObserver1.getObserverOfMonObservable2());
		
		observable1.addObserver(monObserver2.getObserverOfMonObservable1());
		observable2.addObserver(monObserver2.getObserverOfMonObservable2());
		
		
		//events
		observable1.event();
		observable2.event();
		
	}

}
