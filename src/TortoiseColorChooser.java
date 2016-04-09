// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;
import java.awt.Color;
import java.util.Random;

import org.teachingextensions.logo.Colors;

import org.teachingextensions.logo.Tortoise;


public class TortoiseColorChooser {
	public static void main(String[] args) {

		//3. ask the user what color they would like the tortoise to draw
	String anyColors =	JOptionPane.showInputDialog("What color would you like?");
	String anyShape= JOptionPane.showInputDialog("What Shape would you like?"); 
		//4. use an if/else statement to set the pen color that the user requested
if (anyColors.equalsIgnoreCase("Red")) 
{
	Tortoise.setPenColor(Color.red);
}
if (anyColors.equalsIgnoreCase("Blue")) 
{
	Tortoise.setPenColor(Color.blue);
}
if (anyColors.equalsIgnoreCase("Green")) 
{
	Tortoise.setPenColor(Color.green);
}if (anyColors.equalsIgnoreCase("Gray")) 
{
	Tortoise.setPenColor(Color.GRAY);
}if (anyColors.equalsIgnoreCase("orange")) 
{
	Tortoise.setPenColor(Color.orange);
}if (anyColors.equalsIgnoreCase("yellow")) 
{
	Tortoise.setPenColor(Color.yellow);
}
if (anyColors.equalsIgnoreCase("")) 
{
	Tortoise.setPenColor(Color.MAGENTA);	
}  

//if(anyShape.equalsIgnoreCase("Triangle"))
//{
//Tortoise.turn(40);
//Tortoise.move(50);
//Tortoise.turn(40);
//Tortoise.move(40);
//Tortoise.turn(40);
//}


//5. if the user doesn’t enter anything, choose a random color

//6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		Tortoise.setPenWidth(5);
	//1. make the tortoise draw a shape (this will take more than one line of code)
		Tortoise.getBackgroundWindow();
		Tortoise.setSpeed(10);
		for (int i = 0; i < 20; i++) 
		{
		Tortoise.move(50);
		Tortoise.turn(60);
		Tortoise.move(100);
		Tortoise.turn(+120);
		
		}

	}
}



