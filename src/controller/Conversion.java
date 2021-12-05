package controller;

import model.ValueToConvert;

public class Conversion {
	
	ValueToConvert valueToConvert;
	
	public Conversion(ValueToConvert valueToConvert) {
		
		this.valueToConvert = valueToConvert;
		
	}
	
	public void execute(int n) {
		
		valueToConvert.updateValue(n);
		
	}
	
}
