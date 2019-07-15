package _08_calculator;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventObject;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class calculator 
	implements ActionListener{
	JButton leftButton = new JButton("add");
	JButton rightButton = new JButton("sub");
	JButton middleButton = new JButton("mul");
	JButton otherButton = new JButton("div");

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	


	void createUI() {

		frame.add(panel);
		

		panel.add(leftButton);
		panel.add(rightButton);
		panel.add(middleButton);
		panel.add(otherButton);
		frame.pack();
		frame.setTitle("simple calculator");
		frame.setVisible(true);
		leftButton.addActionListener(this);
		rightButton.addActionListener(this);
		middleButton.addActionListener(this);
		otherButton.addActionListener(this);
	}

	public static void main(String[] args) {
		new calculator().createUI();

	}

	private void makeButtons() {
		// TODO Auto-generated method stub
		
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == leftButton) {
			
		}
	}

	public void run() {
		// TODO Auto-generated method stub
		
	}
	}

