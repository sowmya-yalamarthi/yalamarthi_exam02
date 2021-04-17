/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoes;

import java.util.Scanner;
import static shoes.shoeCategory.FLIPFLOPS;

/**
 *
 * @author Sowmya Yalamarthi
 */
public class driver 
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        
            int quantity=2;
            int year=2015;
            double price=40;
        System.out.println("ANSWER FOR QUESTION 7: Sowmya Yalamarthi \n");
        for( shoeCategory s:shoeCategory.values())
        {
            System.out.println(s+"  Price is  $"+s.getPrice());
            System.out.println("cost of "+quantity+" shoes is "+s.getCostOfShoes(quantity));
             }
        System.out.println("******************************************************");
             System.out.println("shoes less than "+price+" is: "+shoeCategory.getShoesLessThan(price));
             System.out.println("shoe categories manufactured after "+year+" are:"+shoeCategory.getShoesManufacturedAfter(year));
    
    }
    
}
