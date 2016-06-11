import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		for (int i = 0; i < 2; i++) {
			String name = JOptionPane.showInputDialog("What animal do you want? Cow,Duck,Wolf,Cat or Llama");
			if (name.equalsIgnoreCase("cow")) {
				playMoo();
			}
			if (name.equalsIgnoreCase("duck")) {
				playQuack();
			}
			if (name.equalsIgnoreCase("wolf")) {
				playWoof();
			}
			if (name.equalsIgnoreCase("cat")) {
				playCat();
			}
			if (name.equalsIgnoreCase("llama")) {
				playLama();
			} else if (name.equalsIgnoreCase("dog")) {
				playdog();
			}
		}

		/*
		 * 1. Ask the user which animal they want, then play the sound of that animal.
		 */

		/* 2. Make it so that the user can keep entering new animals. */
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

	void playCat() {
		playNoise(meowFile);
	}

	void playLama() {
		playNoise(llamaFile);
	}

	void playdog() {
		playNoise(dogFile);
	}

	String quackFile = "/Users/League/Google Drive/league-sounds/quack.wav";
	String mooFile = "/Users/League/Google Drive/league-sounds/moo.wav";
	String woofFile = "/Users/League/Google Drive/league-sounds/woof.wav";
	String meowFile = "/Users/League/Google Drive/league-sounds/meow.wav";
	String llamaFile = "/Users/League/Google Drive/league-sounds/llama.wav";
	String dogFile = "/Users/League/Desktop/163459__littlebigsounds__lbs-fx-dog-small-alert-bark001.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFile));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}
