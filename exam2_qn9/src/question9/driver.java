/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

import java.util.Scanner;

/**
 *
 * @author Sowmya Yalamarthi
 */
public class driver 
{
    public static void main(String[] args)
    {
        System.out.println("ANSWER FOR QUESTION 9: Sowmya Yalamarthi \n");
        footwear fw=new flipflops(4,30);
        System.out.println(fw.toString());
        System.out.println("total cost: "+fw.totalCost(2));
        System.out.println("total cost after tax: "+fw.totalCostAfterTax(2));
        System.out.println("total sales: "+fw.totalSales());
        Scanner scan=new Scanner(System.in);
        System.out.print("color is: ");
        String c=scan.nextLine();
        System.out.print("quantity sold: ");
        double d=scan.nextDouble();
        System.out.print("cost is: ");
        double d1=scan.nextDouble();
        shoe s=new shoe(c,d,d1);
         System.out.println("total cost: "+s.totalCost(d));
        System.out.println("total cost after tax: "+s.totalCostAfterTax(d));
        System.out.println("total sales: "+s.totalSales());
        System.out.println(s.toString());
        
    }
    
}
