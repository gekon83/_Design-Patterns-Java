package _ObserverSimple;

public class Example {

	public static void main(String[] args) {

		SimpleSubject simpleSubject = new SimpleSubject();

		SimpleObserver simpleObserver1 = new SimpleObserver(simpleSubject);
		SimpleObserver simpleObserver2 = new SimpleObserver(simpleSubject);
		SimpleObserver simpleObserver3 = new SimpleObserver(simpleSubject);

		simpleSubject.setValue(50);
		simpleSubject.setValue(21);

	}

}
