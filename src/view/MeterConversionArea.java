package view;

import java.awt.Color;

import javax.swing.JTextArea;

import model.Subject;

public class MeterConversionArea extends JTextArea implements ConversionAreaObserver {
	
	double n = 0;
	private Subject valueToConvert;
	
	public MeterConversionArea(Subject valueToConvert) {
        setBackground(Color.orange);
        setColumns(20);
        setRows(15);
        setText("0m");
		this.valueToConvert = valueToConvert;
		valueToConvert.register(this);
	}
	@Override
	public void update(double n) {

		this.n = n/100;
		this.setText(Double.toString(this.n));
	}

}
