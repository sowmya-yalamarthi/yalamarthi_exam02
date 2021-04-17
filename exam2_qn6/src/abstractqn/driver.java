/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractqn;

import java.util.Scanner;

/**
 *
 * @author Sowmya Yalamarthi
 */
public class driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      
        Scanner scan = new Scanner(System.in);
        System.out.println("ANSWER FOR QUESTION 6 : Sowmya Yalamarthi\n");
	System.out.print("Enter three sides of the triangle: ");
	double s1 = scan.nextDouble();
	double s2 = scan.nextDouble();
	double s3 = scan.nextDouble();
	System.out.print("Enter a color: ");
	String color = scan.next();
	System.out.print("Is the triangle filled (true / false)? ");
	boolean isTriangleFilled = scan.nextBoolean();
	Triangle t1 = new Triangle(s1, s2, s3, color, isTriangleFilled);
		System.out.println(t1);
     
    }
    
}
