package _ObserverSimple;

import java.util.*;

public class SimpleSubject implements Subject{
	private int value = 0;
	private ArrayList<Observer> observers;
	
	public SimpleSubject() {
		observers = new ArrayList<Observer>();
	}
	
	public void addObserver(Observer o) {
		observers.add(o);
		System.out.println("Observer added to my list");
	}
	
	public void removeObserver(Observer o) {
		int index = observers.indexOf(o);
		if (index >= 0) {
			observers.remove(index);
			System.out.println("Observer removed from my list");			
		}
	}
	
	public void setValue(int value) {
		this.value = value;
		notifyObserver();
	}
	
	public void notifyObserver() {
		for (Observer o : observers)
			o.update(value);
	}
}
