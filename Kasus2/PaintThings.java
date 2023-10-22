package com.mycompany.Kasus2;

/*@author Fikri*/
import java.text.DecimalFormat;

public class PaintThings {
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	final double coverage = 350;
        Paint paint = new Paint(coverage);

        Rectangle deck;
        Sphere bigBall;
        Cylinder tank;

        double deckamt, ballamt, tankamt;

        DecimalFormat fmt = new DecimalFormat("0.#");

        // Instantiate the shape objects
        deck = new Rectangle(20, 35);
        bigBall = new Sphere(15);
        tank = new Cylinder(10, 30);

        // Calculate the amount of paint needed
        deckamt = paint.amount(deck);
        ballamt = paint.amount(bigBall);
        tankamt = paint.amount(tank);

        System.out.println("\nNumber of gallons of paint needed...");
        System.out.println("Deck " + fmt.format(deckamt));
        System.out.println("BigBall " + fmt.format(ballamt));
        System.out.println("Tank " + fmt.format(tankamt));
    }

}