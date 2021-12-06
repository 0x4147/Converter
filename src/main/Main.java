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
	
	public static void main(String[] args) {
		
		ValueToConvert recevier = new ValueToConvert();
		Conversion command = new Conversion(recevier);
		
		CentimeterConversionArea cArea = new CentimeterConversionArea(command, 5);
		FeetConversionArea feetArea = new FeetConversionArea(recevier);
		MeterConversionArea metersArea = new MeterConversionArea(recevier);
		recevier.register(feetArea);
		recevier.register(metersArea);
		
        JPanel panel = new JPanel();
        JFrame frame = new JFrame("Conversion");
		MenuBarListener menubarListener = new MenuBarListener(cArea);
		MenuBar gameMenuBar = new MenuBar(menubarListener);
		frame.setJMenuBar(gameMenuBar);
//        JTextArea cmArea = new JTextArea("cm", 10, 10);
//        cmArea.setBackground(new Color(112, 176, 49));
//        JTextArea mArea = new JTextArea("meters", 10, 10);
//        JTextArea ftArea = new JTextArea("feet", 10, 10);
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
