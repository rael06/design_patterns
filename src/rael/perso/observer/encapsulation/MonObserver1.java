package rael.perso.observer.encapsulation;

public class MonObserver1 {
	private static final String NAME = "MonObserver 1";
	private static final String MESSAGE = NAME + " s'est mis � jour d'apr�s l'�v�nement de ";

	private Observer<MonObservable1> observerOfMonObservable1 = new ObserverOfMonObservable1();
	private Observer<MonObservable2> observerOfMonObservable2 = new ObserverOfMonObservable2();

	public Observer<MonObservable2> getObserverOfMonObservable2() {
		return observerOfMonObservable2;
	}

	public Observer<MonObservable1> getObserverOfMonObservable1() {
		return observerOfMonObservable1;
	}

	public static class ObserverOfMonObservable1 implements Observer<MonObservable1> {

		@Override
		public void update(MonObservable1 observable) {
			System.out.println(MESSAGE + observable.getName());
		}
	}

	public static class ObserverOfMonObservable2 implements Observer<MonObservable2> {

		@Override
		public void update(MonObservable2 observable) {
			System.out.println(MESSAGE + observable.getName());
		}
	}

}
