package _04_chuckle_clicker;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventObject;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class chuckleClicker 
	implements ActionListener{
	JButton leftButton = new JButton("joke");
	JButton rightButton = new JButton("punchline");

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();


	void createUI() {

		frame.add(panel);
		

		panel.add(leftButton);
		panel.add(rightButton);
		frame.pack();
		frame.setTitle("chuckle clicker");
		frame.setVisible(true);
		leftButton.addActionListener(this);
		rightButton.addActionListener(this);
	}

	public static void main(String[] args) {
		new chuckleClicker().createUI();

	}

	private void makeButtons() {
		// TODO Auto-generated method stub
		
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == leftButton) {
			JOptionPane.showMessageDialog(null, "What do you call a guy with a rubber toe? Roberto.");
		}
			if(e.getSource()== rightButton) {
				JOptionPane.showMessageDialog(null, "Why does Waldo wear stripes? Because he doesn’t want to be spotted.");
			
		}
	}
	}

