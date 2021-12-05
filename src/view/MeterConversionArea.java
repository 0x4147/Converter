package view;

import model.Subject;

public class MeterConversionArea implements ConversionAreaObserver {
	
	int n = 0;
	private Subject valueToConvert;
	
	public MeterConversionArea(Subject valueToConvert) {
		
		this.valueToConvert = valueToConvert;
//		valueToConvert.register(this);
	}
	@Override
	public void update(int n) {

		this.n = n * 3;
		System.out.println(this.n);
	}

}
