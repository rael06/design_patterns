package infotel.perso.observers.simpleobserver;

public class MonObserver implements Observer {

	@Override
	public void update(Observable observable) {
		if (observable instanceof MonObservable1)
			System.out.println("mise à jour de : " + ((MonObservable1) observable).getName());
		if (observable instanceof MonObservable2)
			System.out.println("mise à jour de : " + ((MonObservable2) observable).getName());
	}

}
