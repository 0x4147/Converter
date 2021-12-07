package main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import controller.Conversion;
import controller.MenuBarListener;
import model.ValueToConvert;
import view.CentimeterConversionArea;
import view.FeetConversionArea;
import view.MenuBar;
import view.MeterConversionArea;

public class Main {
	/**
	 * This class builds the frame, the panels and the objects required to launch the application
	 * @param args
	 */
	public static void main(String[] args) {
		
		ValueToConvert recevier = new ValueToConvert();
		Conversion command = new Conversion(recevier);
		
		CentimeterConversionArea cArea = new CentimeterConversionArea(command);
		FeetConversionArea feetArea = new FeetConversionArea(recevier);
		MeterConversionArea metersArea = new MeterConversionArea(recevier);
		
        JPanel panel = new JPanel();
        JFrame frame = new JFrame("Conversion");
		MenuBarListener menubarListener = new MenuBarListener(cArea);
		MenuBar menuBar = new MenuBar(menubarListener);
		frame.setJMenuBar(menuBar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        
        panel.add(feetArea);
        panel.add(metersArea);
        panel.add(cArea);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
	}
}
