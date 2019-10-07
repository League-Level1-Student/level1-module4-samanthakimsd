package _12_slot_machine;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class slotMachine implements ActionListener {
public static void main(String[] args) {
	new slotMachine().createUI();
}
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button = new JButton("spin");

private void createUI() {
	// TODO Auto-generated method stub
	frame.add(panel);
	frame.setSize(20,20);
	panel.add(button);
	frame.setSize(600,400);
	frame.setVisible(true);
	button.addActionListener(this);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
}

private JLabel createLabelImage(String fileName) throws MalformedURLException{
    URL imageURL = getClass().getResource(fileName);
if (imageURL == null){
	System.err.println("Could not find image " + fileName);
	return new JLabel();
}
Icon icon = new ImageIcon(imageURL);
JLabel imageLabel = new JLabel(icon);
return imageLabel;
}



@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	try {
		JLabel label = createLabelImage("cherry.png"); 
		panel.add(label);
	} catch (MalformedURLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}

	try {
		JLabel label = createLabelImage("lemon.jpg");
		panel.add(label);
	} catch (MalformedURLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	try {
		JLabel label = createLabelImage("Orange-512.png");
		panel.add(label);
	} catch (MalformedURLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	frame.pack();
}
}
