package controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.CentimeterConversionArea;

public class MenuBarListener implements ActionListener {

	private final CentimeterConversionArea cmPanel;

	public MenuBarListener(CentimeterConversionArea cmPanel) {
		this.cmPanel = cmPanel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		cmPanel.saveValue(Double.parseDouble(cmPanel.getText()));
		
	}
}
