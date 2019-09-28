package _12_slot_machine;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class slotMachine {
public static void main(String[] args) {
	new slotMachine().createUI();
}
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JLabel label = new JLabel();

private void createUI() {
	// TODO Auto-generated method stub
	frame.add(panel);
	frame.setSize(20,20);
	panel.add(label);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
}
}
