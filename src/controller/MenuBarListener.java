package controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.CentimeterConversionArea;
import view.MyPanel;

public class MenuBarListener implements ActionListener {

	private final CentimeterConversionArea cmPanel;

	public MenuBarListener(CentimeterConversionArea cmPanel) {
		this.cmPanel = cmPanel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		cmPanel.press();
		
	}
}
