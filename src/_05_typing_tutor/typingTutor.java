package _05_typing_tutor;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class typingTutor {
	public static void main(String[] args) {
		new typingTutor().createUI();
	
	}
    JFrame frame = new JFrame("type or die");
	JLabel label = new JLabel();
	
	char currentLetter;
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}
	
	private void createUI() {
	frame.pack();
		frame.setVisible(true);
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
	}
	
}
