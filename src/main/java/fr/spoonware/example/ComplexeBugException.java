package fr.spoonware.example;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by nicolas on 21/01/2015.
 */
public class ComplexeBugException extends AbstractAction {

	private A a;

	public ComplexeBugException() {
		super("A handled NPE bug");

		a = new A(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		a.doIt();
	}
}
