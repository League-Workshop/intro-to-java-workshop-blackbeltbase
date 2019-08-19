package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
	Robot redRobot = new Robot();
	redRobot.setSpeed(100);
int x = 100;
	redRobot.penDown();
	for(int i = 0; i < 4; i +=1)
	{
		redRobot.move(x);
		redRobot.turn(90);
	}
	}
	}
