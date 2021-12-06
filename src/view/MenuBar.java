package view;

import javax.swing.JMenuBar;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class MenuBar extends JMenuBar{
	
		public MenuBar(ActionListener menubarListener) {
			
			super();
			JMenu gameMenu = new JMenu("Update Model");
			gameMenu.add(createMenuItem("Save input centimeters", KeyEvent.VK_N, menubarListener));
			super.add(gameMenu);
			
		}
		
		private JMenuItem createMenuItem(String text, int accelerator, ActionListener listener) {
			JMenuItem menuItem = new JMenuItem(text);
			menuItem.addActionListener(listener);
			menuItem.setAccelerator(KeyStroke.getKeyStroke(accelerator, 0));
			return menuItem;
		}


    }



//public MenuBar(){
//    MenuBarListener menuBarListener = new MenuBarListener();
//    JMenuItem saveInput = new JemnuItem(" Saveinputcentimeters");
//
//    saveInput.addActionListener(menuBarListener);
//    JMenu updateModel =  new JMenu("Update model" , false);
//    updateModel.add(saveIinput);
//    this.add(updateModel);
//   }