/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package removeDuplicates;

/**
 *
 * @author Sowmya Yalamarthi
 */
 import java.util.ArrayList;
import java.util.Scanner;

class RemoveDuplicates {
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
	ArrayList<Integer> rd = new ArrayList<Integer>();
        System.out.println("ANSWER FOR QUESTION 1: Sowmya Yalamarthi \n");
	System.out.print("Enter ten integers: ");
	for (int m = 0; m < 10; m++) 
        {
	rd.add(scan.nextInt());
        }
	removeDuplicate(rd);
	System.out.print("The distinct integers are ");
	for (int i = 0; i < rd.size(); i++) 
        {
        System.out.print(rd.get(i) + " ");
	}
	System.out.println();
}
  
public static void removeDuplicate(ArrayList<Integer> list) 
{
	for (int k = 0; k < list.size() - 1; k++) {
	for (int j = k + 1; j < list.size(); j++) {
	if (list.get(k) == list.get(j))
        list.remove(j);
			}
                }
        }
}

