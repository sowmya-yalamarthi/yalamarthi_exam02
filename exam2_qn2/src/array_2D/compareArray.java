/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_2D;
import java.util.Scanner;

/**
 *
 * @author Sowmya Yalamarthi
 */
public class compareArray {
   
	public static void main(String[] args) {
		 System.out.println("ANSWER FOR QUESTION 2 :Sowmya Yalamarthi\n");
		System.out.print("Enter list1: ");
		int[][] list1 = getArray();
		System.out.print("Enter list2: ");
		int[][] list2 = getArray();
		System.out.println("The two arrays are" + 
			(equals(list1, list2) ? " " : " not ") + "strictly identical");
	}

	public static boolean equals(int[][] m1, int[][] m2) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (m1[i][j] != m2[i][j])
					return false;
			}
		}
		return true;
	}
	public static int[][] getArray() {
		Scanner scan = new Scanner(System.in);
		int[][] k = new int[3][3];
		for (int i = 0; i < k.length; i++) {
			for (int j = 0; j < k[i].length; j++) {
				k[i][j] = scan.nextInt();
			}
		}
		return k;
	}
}
    
