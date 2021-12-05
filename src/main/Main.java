package main;

import controller.Conversion;
import model.ValueToConvert;
import view.CentimeterConversionArea;
import view.ConversionAreaObserver;
import view.FeetConversionArea;
import view.MeterConversionArea;


public class Main {
	
	public static void main(String[] args) {
		ValueToConvert recevier = new ValueToConvert();
		
		ConversionAreaObserver fArea = new FeetConversionArea(recevier);
		ConversionAreaObserver mArea = new MeterConversionArea(recevier);
		
		recevier.register(fArea);
		recevier.register(mArea);
		
		Conversion command = new Conversion(recevier);
		CentimeterConversionArea cArea = new CentimeterConversionArea(command, 5);
		cArea.press();
	}

}
