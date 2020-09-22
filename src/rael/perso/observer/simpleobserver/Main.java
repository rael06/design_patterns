package rael.perso.observer.simpleobserver;

public class Main {

	public static void main(String[] args) {
		
		MonObserver observer1 = new MonObserver();
		
		MonObservable1 observable1 = new MonObservable1("Observable 1");
		observable1.addObserver(observer1);
		
		MonObservable2 observable2 = new MonObservable2("Observable 2");
		observable2.addObserver(observer1);
		
		observable1.event();
		observable2.event();
	}

}
