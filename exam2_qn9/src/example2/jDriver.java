/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example2;

/**
 *
 * @author Sowmya Yalamarthi
 */
public class jDriver 
{
    public static void main(String[] args)
    {
       System.out.println("ANSWER FOR QUESTION 9: Sowmya Yalamarthi \n");
       subJewelry j=new subJewelry(2.8,300);
        System.out.println("jewelry type: " +j.jewelryType());
        System.out.println("total price: "+j.price());
        System.out.println("total price after tax: "+j.totalcost());
    }
    
}
