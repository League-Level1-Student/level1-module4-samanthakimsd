package _07_fortune_teller;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	int r = new Random().nextInt(4);
	// 3. Print out this variable
System.out.println(r);
	// 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog("ask a question for the 8 ball");
	// 5. If the random number is 0
if (r == 0) {
	JOptionPane.showMessageDialog(null, "yes");
}
	// -- tell the user "Yes"

	// 6. If the random number is 1
if (r == 1) {
	JOptionPane.showMessageDialog(null, "no");
}
	// -- tell the user "No"

	// 7. If the random number is 2
if (r == 2) {
	JOptionPane.showMessageDialog(null, "maybe you should ask google");
}
	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3
if (r == 3) {
	JOptionPane.showMessageDialog(null, "ask again later");
}
	// -- write your own answer

}}
