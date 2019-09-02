package _11_whack_a_mole;


import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class wackAMole implements ActionListener {
	public static void main(String[] args) {
		Random randy = new Random();
	new wackAMole().createUI(randy.nextInt(24));

}
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton moleButton = new JButton("mole");
	
	private void createUI(int x) {
	frame.add(panel);
	frame.setSize(250, 300);

	


	for(int i = 0; i<23;i++) {
		JButton button = new JButton();
		button.addActionListener(this);
		panel.add(button);
		panel.add(moleButton);
	}
	frame.setVisible(true);
	


	// TODO Auto-generated method stub
	
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}}
