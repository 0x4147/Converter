package model;

import java.util.ArrayList;
import view.ConversionAreaObserver;


public class ValueToConvert implements Subject{

	private ArrayList<ConversionAreaObserver> observers;
	double value = 0;
	
	public ValueToConvert() {
		
		observers = new ArrayList<ConversionAreaObserver>();
		
	}
	@Override
	public void register(ConversionAreaObserver newObserver) {
		// TODO Auto-generated method stub
		observers.add(newObserver);

	}

	@Override
	public void unregister(ConversionAreaObserver o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyObserver() {

        for(ConversionAreaObserver observer : observers){
        	observer.update(value);

        }
	}
	
	public void updateValue(double n) {
		
		value = n;
		notifyObserver();
		
	}

}
