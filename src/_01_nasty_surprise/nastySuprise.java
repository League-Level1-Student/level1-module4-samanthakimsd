package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class nastySuprise implements ActionListener {
	public static void main(String[] args) {
		new nastySuprise().createUI();
	}
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	private void createUI() {
	frame.add(panel);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	panel.add(button1);
	panel.add(button2);
	button1.setText("trick");
	button2.setText("treat");
	button1.addActionListener(this);
	button2.addActionListener(this);
	frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button1) {

			    }
			}
		
	}

