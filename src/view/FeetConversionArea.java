package view;

import model.Subject;

public class FeetConversionArea implements ConversionAreaObserver{
	
	int n = 0;
	private Subject valueToConvert;
	
	public FeetConversionArea(Subject valueToConvert) {
		
		this.valueToConvert = valueToConvert;
//		valueToConvert.register(this);
	}
	
	@Override
	public void update(int n) {
		
		this.n = n * 2;
		System.out.println(this.n);
		
	}

}
