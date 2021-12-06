package view;

import java.awt.Color;

import javax.swing.JTextArea;

import model.Subject;

public class FeetConversionArea extends JTextArea implements ConversionAreaObserver{
	
	double n = 0;
	private Subject valueToConvert;
	
	public FeetConversionArea(Subject valueToConvert) {
        setBackground(Color.green);
        setColumns(20);
        setRows(15);
        setText("0ft");
		this.valueToConvert = valueToConvert;
//		valueToConvert.register(this);
	}
	
	@Override
	public void update(double n) {
		
		this.n = n/30.48;
		this.setText(Double.toString(this.n));
		
	}

}
