package controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.CentimeterConversionArea;
/**
 * Creates a listener for the menu bar
 * @author asanka
 *
 */
public class MenuBarListener implements ActionListener {

	private final CentimeterConversionArea cmPanel;

	public MenuBarListener(CentimeterConversionArea cmPanel) {
		this.cmPanel = cmPanel;
	}
	
	/**
	 * Initiates the command with the value the user entered for conversion
	 * @precondition: the value received is a double
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		cmPanel.saveValue(Double.parseDouble(cmPanel.getText()));
		
	}
}
