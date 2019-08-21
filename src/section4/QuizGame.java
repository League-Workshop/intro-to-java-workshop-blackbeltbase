package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
		String question = JOptionPane.showInputDialog("1+1 =");
		if(question.equalsIgnoreCase("2"))
		{
			score += 1;
		}
		String question2 = JOptionPane.showInputDialog("2+2 =");
		if(question2.equalsIgnoreCase("4"))
		{
			score += 1;
		}
		String question3 = JOptionPane.showInputDialog("4+4 =");
		if(question3.equalsIgnoreCase("8"))
		{
			score += 1;
		}
		String question4 = JOptionPane.showInputDialog("8+8 =");
		if(question4.equalsIgnoreCase("16"))
		{
			score += 1;
		}
		String question5 = JOptionPane.showInputDialog("16+16 =");
		if(question5.equalsIgnoreCase("32"))
		{
			score += 1;
		}
		String question6 = JOptionPane.showInputDialog("32+32 =");
		if(question6.equalsIgnoreCase("64"))
		{
			score += 1;
		}
		String question7 = JOptionPane.showInputDialog("64+64 =");
		if(question7.equalsIgnoreCase("128"))
		{
			score += 1;
		}
		String question8 = JOptionPane.showInputDialog("128+128 =");
		if(question8.equalsIgnoreCase("256"))
		{
			score += 1;
		}
		String question9 = JOptionPane.showInputDialog("256+256 =");
		if(question9.equalsIgnoreCase("512"))
		{
			score += 1;
		}
		String question10 = JOptionPane.showInputDialog("512+512 =");
		if(question10.equalsIgnoreCase("1024"))
		{
			score += 1;
		}
		// 3.  Use an if statement to check if their answer is correct
		String grade;
		if(score < 5)
		{
			grade = ("F");
		}
		else if(score <= 5)
		{
			grade = ("D");
		}
		else if(score <= 6 )
		{
			grade = ("D");
		}
		else if(score <= 7)
		{
			grade = ("C");
		}
		else if(score <= 8)
		{
			grade = ("B");
		}
		else if(score <= 9)
		{
			grade = ("A");
		}
		else
		{
			grade = ("A+");
		}
		

		JOptionPane.showMessageDialog(null, "Your score is "+ score +" out of 10."+
		"You got a/an "+grade+" !");
		}
		// 4.  if the user's answer was correct, add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
	
	}
