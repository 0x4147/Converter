package view;

import java.awt.Color;

import javax.swing.JTextArea;

import controller.Conversion;

public class CentimeterConversionArea extends JTextArea{
	
	Conversion command;
	double n = 0;
	
	public CentimeterConversionArea(Conversion newCommand) {
        setBackground(Color.yellow);
        setColumns(20);
        setRows(15);
        setText("0");
		command = newCommand;
	}
	
	public void saveValue(double n) {
		this.n = n;
		command.execute(n);
	}
}
