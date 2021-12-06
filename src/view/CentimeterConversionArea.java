package view;

import java.awt.Color;

import javax.swing.JTextArea;

import controller.Conversion;

public class CentimeterConversionArea extends JTextArea{
	
	Conversion command;
	int n = 0;
	
	public CentimeterConversionArea(Conversion newCommand, int n) {
        setBackground(Color.yellow);
        setColumns(20);
        setRows(15);
        setText("0cm");
		command = newCommand;
		this.n = n;
		
	}
	
	public void press() {
		command.execute(n);
		
	}
}
