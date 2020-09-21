package infotel.perso.observers.annonymousclasses;

public class MonObserver2 {
	private static final String NAME = "MonObserver 2";
	private static final String MESSAGE = NAME + " s'est mis à jour d'après l'évènement de ";

	private ObserverImp<MonObservable1> observerOfMonObservable1 = new ObserverImp<MonObservable1>() {
		@Override
		public void update(MonObservable1 observable) {
			System.out.println(MESSAGE + observable.getName());
		}
	};

	private ObserverImp<MonObservable2> observerOfMonObservable2 = new ObserverImp<MonObservable2>() {
//		@Override
//		public void update(MonObservable2 observable) {
//			System.out.println(MESSAGE + observable.getName());
//		}
	};

	public ObserverImp<MonObservable2> getObserverOfMonObservable2() {
		return observerOfMonObservable2;
	}

	public ObserverImp<MonObservable1> getObserverOfMonObservable1() {
		return observerOfMonObservable1;
	}

	public void update(MonObservable1 observable) {
		observerOfMonObservable1.update(observable);
	}

	public void update(MonObservable2 observable) {
		observerOfMonObservable2.update(observable);
	}

}
