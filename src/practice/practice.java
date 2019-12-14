package practice;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class practice {
public static void main(String[] args) {
	new practice().createUI();
	}
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button = new JButton();

private void createUI() {
	// TODO Auto-generated method stub
	frame.add(panel);
	frame.setSize(100,60);
	panel.add(button);
	button.setText("press me");
	frame.setVisible(true);
}
}

