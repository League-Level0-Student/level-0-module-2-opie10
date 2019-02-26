package methods;

import java.applet.AudioClip;
import java.net.URI;

//Copyright (c) The League of Amazing Programmers 2013-2017

//Level 0

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		/*
		 * 1. Ask the user which animal they want, then play the sound of that animal.
		 */

		String amount = JOptionPane.showInputDialog("How many times would you like to listen to animal sounds?");
		int amountint = Integer.parseInt(amount);
		for (int i = 0; i < amountint; i++) {
			String usera = JOptionPane.showInputDialog("What animal would you like to listen to? you have "
					+ (amountint - i) + " sounds left \n Disclamer: we are not liable if you are annoyed");
			/* 2. Make it so that the user can keep entering new animals. */

			if (usera.equals("cow")) {
				playMoo();

			}

			else if (usera.equals("duck")) {
				playQuack();

			} else if (usera.equals("dog")) {
				playWoof();

			} else if (usera.equals("llama")) {
				playLlama();

			} else if (usera.equals("cat")) {
				playCat();

			} else {
				JOptionPane.showMessageDialog(null,"Your answer had no file");

				playVideo("http://weebls-stuff.com/toons/badgers/");
			}

		}

	}

	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}

	void playLlama() {
		playNoise(llamaFile);
	}

	void playCat() {
		playNoise(meowFile);
	}

	String quackFile = "quack.wav";
	String mooFile = "moo.wav";
	String woofFile = "woof.wav";
	String meowFile = "meow.wav";
	String llamaFile = "llama.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}
