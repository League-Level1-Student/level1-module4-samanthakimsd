package _12_slot_machine;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class slotMachine implements ActionListener {
public static void main(String[] args) {
	new slotMachine().createUI();
}
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button = new JButton("spin");
JLabel label1;
JLabel label2;
JLabel label3;
private void createUI() {
	// TODO Auto-generated method stub
	frame.add(panel);
	frame.setSize(20,20);
	panel.add(button);
	frame.setSize(600,400);
	frame.setVisible(true);
	button.addActionListener(this);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	try {
		 label1 = createLabelImage("cherry.png"); 
		panel.add(label1);
	} catch (MalformedURLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	
	}

	try {
		 label2 = createLabelImage("lemon.jpg");
		panel.add(label2);
	} catch (MalformedURLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	try {
		 label3 = createLabelImage("Orange-512.png");
		panel.add(label3);
	} catch (MalformedURLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	frame.pack();
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
	String pic = "";
	panel.removeAll();
	Random r = new Random();
	int i = r.nextInt(3);
	int b = r.nextInt(3);
	int c = r.nextInt(3);
	
	if (i == 0 ) {
		pic = "cherry.png";
	}
	if (b == 0) {
		pic = "Orange-512.png";
	}
	if (b == 0) {
		pic = "lemon.jpg";
	}
	if (i== 1 ) {
		pic = "lemon.jpg";
	}
	if (b == 1) {
		pic = "cherry.png";
	}
	if (b == 1) {
		pic = "Orange-512.png";
	}
	if(i == 2) {
		pic = "Orange-512.png";
	}
	if (b == 2) {
		pic = "lemon.jpg";
	}	
	if (b == 2) {
	    pic = "cherry.png";
	}	
	try {
		label1 = createLabelImage(pic);
		panel.add(label1);
	} catch (MalformedURLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	try {
		 label2 = createLabelImage(pic);
		panel.add(label2);
	} catch (MalformedURLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	try {
		 label3 = createLabelImage(pic);
		panel.add(label3);
	} catch (MalformedURLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	frame.pack();
	JOptionPane.showMessageDialog(null, "yay you won !!");
}

}
