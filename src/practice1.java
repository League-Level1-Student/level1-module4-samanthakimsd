import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class practice1 implements ActionListener {
public static void main(String[] args) {
	new practice1().createUI();
}
JButton middleButton = new JButton();
JTextField rightBox = new JTextField(25);
JFrame frame = new JFrame();
JPanel panel = new JPanel();

private void createUI() {
	// TODO Auto-generated method stub
	frame.add(panel);
	frame.setSize(500, 70);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	panel.add(rightBox);
	panel.add(middleButton);
	rightBox.setVisible(true);
	middleButton.setVisible(true);
	middleButton.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String s = rightBox.getText();
	StringBuilder sb = new StringBuilder(s);
	sb.reverse();
	rightBox.setText(sb.toString());
	
}
}
