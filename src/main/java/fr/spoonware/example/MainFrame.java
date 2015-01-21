package fr.spoonware.example;

import javax.swing.*;
import java.awt.*;

/**
 * Created by nicolas on 21/01/2015.
 */
public class MainFrame extends JFrame {

	public MainFrame() {

		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(new JButton(new NpeAction()));
		getContentPane().add(new JButton(new ComplexeBugException()));
		getContentPane().add(new JButton(new HandledException()));
	}

}
