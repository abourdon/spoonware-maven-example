package fr.spoonware.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Created by nicolas on 21/01/2015.
 */
public class NpeAction extends AbstractAction {

	public NpeAction() {
		super("NullPointer crash");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String myvalue = null;
		JOptionPane.showConfirmDialog((Component) e.getSource(), myvalue.toLowerCase());
	}
}
