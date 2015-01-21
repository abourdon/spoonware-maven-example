import fr.spoonware.SpoonwareJava;
import fr.spoonware.example.MainFrame;

import javax.swing.*;

/**
 * Created by nicolas on 21/01/2015.
 */
public class Main {

	public static void main(String[] args) throws Exception {
		SpoonwareJava.init("https://spoonware.lille.inria.fr/rest","ID","TOKEN");
		
		SwingUtilities.invokeAndWait(new Runnable() {
			@Override
			public void run() {
				MainFrame frame = new MainFrame();
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame.pack();
				frame.setLocationByPlatform(true);
				frame.setVisible(true);
			}
		});
	}
}
