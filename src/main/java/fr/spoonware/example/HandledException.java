package fr.spoonware.example;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by nicolas on 21/01/2015.
 */
public class HandledException extends AbstractAction {

	public HandledException() {
		super("Handled Exception");
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object obj = new A(new B());

		try {
			((B) obj).doIt();
		} catch (ClassCastException ex) {
			ex.printStackTrace();
		}

	}
}
