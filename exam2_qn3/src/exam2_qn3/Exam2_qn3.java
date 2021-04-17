/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2_qn3;
 import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Sowmya Yalamarthi
 */
public class Exam2_qn3 {

    /**
     * @param args the command line arguments
     */
	public static void main(String[] args) {
           
		 System.out.println("ANSWER FOR QUESTION 3 :Sowmya Yalamarthi\n");
		ArrayList<Object> obj = new ArrayList<Object>();
		obj.add(new Date());		
		obj.add(new String("Added String class object"));
                obj.add(new Loan(243333,"approved",50000));		
			
		obj.add(new Circle(3.0));	
		for (int i = 0; i < obj.size(); i++) {
			System.out.println((obj.get(i)).toString());
		}
	}
    }
    

