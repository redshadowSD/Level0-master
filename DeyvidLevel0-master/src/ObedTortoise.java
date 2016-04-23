import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class ObedTortoise {

	public static void main(String[] args) {
		Tortoise.show();
		String shape = JOptionPane.showInputDialog("What shape would you like? Square,Triangle, Circle or ect.");
		if (shape.equalsIgnoreCase("square")) {
			square();
		}
		if (shape.equalsIgnoreCase("triangle")) {
			triangle();
		}
	}

	public static void square() {
		Tortoise.move(100);
		Tortoise.turn(90);
		Tortoise.move(100);
		Tortoise.turn(90);
		Tortoise.move(100);
		Tortoise.turn(90);
		Tortoise.move(100);
		Tortoise.turn(90);
	}

	public static void triangle() {
		Tortoise.getAngle();
		Tortoise.setAngle(45);
		Tortoise.move(100);
		Tortoise.turn(120);
		Tortoise.move(100);
		Tortoise.turn(120);
		Tortoise.move(100);
		Tortoise.turn(120);
	}

	// 4. Have the Tortoise draw a triangle.

	// 5. Extract this code into a drawTriangle() method.

	// 6. Have the Tortoise draw a circle.

	// 7. Extract this code into a drawCircle() method.

	// 8. Ask the user which shape they want. Draw the appropriate shape depending on their answer.

	// 9. Ask the user which color they want. Color the the shape depending on their answer.

}
