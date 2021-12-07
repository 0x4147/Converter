package view;

import javax.swing.JMenuBar;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

/**
 * Creates a menu bar and and sets up the required features
 * @author asanka
 *
 */
public class MenuBar extends JMenuBar{
	
		public MenuBar(ActionListener menubarListener) {
			
			super();
			JMenu menu = new JMenu("Update Model");
			menu.add(createMenuItem("Save input centimeters", KeyEvent.VK_N, menubarListener));
			super.add(menu);
			
		}
		
		private JMenuItem createMenuItem(String text, int accelerator, ActionListener listener) {
			JMenuItem menuItem = new JMenuItem(text);
			menuItem.addActionListener(listener);
			menuItem.setAccelerator(KeyStroke.getKeyStroke(accelerator, 0));
			return menuItem;
		}

	}
