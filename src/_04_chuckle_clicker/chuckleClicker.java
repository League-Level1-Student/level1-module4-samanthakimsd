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

public class chuckleClicker {
	JButton leftButton = new JButton("joke");
	JButton rightButton = new JButton("punchline");
	JButton middleButton = new JButton();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	void createUI() {

		frame.add(panel);
		

		panel.add(leftButton);
		panel.add(rightButton);
		frame.pack();
		frame.setTitle("chuckle clicker");
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new chuckleClicker().createUI();

	}

	private void makeButtons() {
		// TODO Auto-generated method stub
		
		}
	}

