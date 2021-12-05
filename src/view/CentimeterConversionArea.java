package view;

import controller.Conversion;

public class CentimeterConversionArea {
	
	Conversion command;
	int n = 0;
	
	public CentimeterConversionArea(Conversion newCommand, int n) {
		
		command = newCommand;
		this.n = n;
		
	}
	
	public void press() {
		command.execute(n);
		
	}
}
