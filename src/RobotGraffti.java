import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffti {
	public static void main(String[] args) {
		Robot bob = new Robot();
		bob.penDown();
		bob.setPenColor(Color.blue);
		bob.move(400);
		bob.turn(45);
		for (int i = 0; i < 13; i++) {
			bob.turn(20);
			bob.move(85);
		}
	}
}
