package _10_pig_latin;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatinTranslator implements ActionListener {
public static void main(String[] args) {
	new PigLatinTranslator().createUI();
}
JButton middleButton = new JButton();
JTextField rightBox = new JTextField(25);
JTextField leftBox = new JTextField(25);
JFrame frame = new JFrame();
JPanel panel = new JPanel();

private void createUI() {
frame.add(panel);
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
panel.add(leftBox);
panel.add(middleButton);
panel.add(rightBox);
rightBox.setVisible(true);
leftBox.setVisible(true);
middleButton.setText("Translate");
middleButton.addActionListener(this);
frame.pack();
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
String s = leftBox.getText();
String p = PigLatin.pigWord(s);
rightBox.setText(p);
System.out.println(s);
System.out.println(p);


}}





