package _09_latest_tweet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.management.Query;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class LatestTweet implements ActionListener {
public static void main(String[] args) {
	new LatestTweet().createUI1();
}

JButton middleButton = new JButton();
JTextField leftBox = new JTextField(10);
JFrame frame = new JFrame();
JPanel panel = new JPanel();

private void createUI1() {
frame.add(panel);
frame.setVisible(true);
panel.add(leftBox);
panel.add(middleButton);
leftBox.setVisible(true);
middleButton.setText("Search the Twitterverse");
middleButton.addActionListener(this);
frame.pack();
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JOptionPane.showMessageDialog(null, "Tweet, Tweet");
	String s = leftBox.getText();
	String t = getLatestTweet(s);
	
	    
	


}

private String getLatestTweet(String s) {
	// TODO Auto-generated method stub
	return null;
}

}
