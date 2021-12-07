package controller;

import model.ValueToConvert;

public class Conversion {
	
	ValueToConvert valueToConvert;
	
	public Conversion(ValueToConvert valueToConvert) {
		
		this.valueToConvert = valueToConvert;
		
	}
	
	public void execute(double n) {
		
		valueToConvert.updateValue(n);
		
	}
	
}
