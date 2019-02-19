//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extra;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ThatWasEasy extends MouseAdapter {

	public void mouseClicked(MouseEvent arg0) {
		/* Use the speak method to make the button work. */
		speak("That was easy!!!!!!!!!!!");
		
	}

	private void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ThatWasEasy();

	}

	public ThatWasEasy() {
		showEasyButton();
		easyButtonImage.addMouseListener(this);

	}

	JLabel easyButtonImage;

	private void showEasyButton() {
		JFrame quizWindow = new JFrame();
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		quizWindow.setVisible(true);

		Icon icon = new ImageIcon(getClass().getResource("easy_button.jpg"));
		this.easyButtonImage = new JLabel(icon);
		quizWindow.add(easyButtonImage);
		quizWindow.pack();
		
	}

}


