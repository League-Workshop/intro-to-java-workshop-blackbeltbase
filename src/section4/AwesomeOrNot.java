package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
 int randomNumber = new Random().nextInt(4);
	// 3. Print out this variable
System.out.println(randomNumber);
	// 4. Get the user to enter something that they think is awesome
String awesome = JOptionPane.showInputDialog("What do you think is awesome?");
	// 5. If the random number is 0
if(randomNumber == 0)
{
	JOptionPane.showMessageDialog(null, "That's awesome!");
}
else if(randomNumber == 1)
{
	JOptionPane.showMessageDialog(null, "That's ok.");
}
else if(randomNumber == 2)
{
	JOptionPane.showMessageDialog(null, "That's boring.");
}
else if(randomNumber == 3)
{
	JOptionPane.showMessageDialog(null, "That's odd.");
	

}
	// -- tell the user whatever they entered is awesome!

	// 6. If the random number is 1

	// -- tell the user whatever they entered is ok.

	// 7. If the random number is 2

	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3

	// -- write your own answer
}
}


