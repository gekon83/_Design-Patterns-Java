package _ObserverSimple;

public class SimpleObserver implements Observer {
	private int value;
	private Subject simpleSubject;
	
	public SimpleObserver(Subject simpleSubject) {
		this.simpleSubject = simpleSubject;
		simpleSubject.addObserver(this);
	}

	public void update(int value) {
		this.value = value;
		displayValue();
	}
	
	public void displayValue() {
		System.out.println("Value has changed to " + value);		
	}
}
