/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footwear;

/**
 *
 * @author Sowmya Yalamarthi
 */
public class footWearDriver 
{
    public static void main(String[] args)
    {
        footWear f1=new footWear("sports","nike");
        footWear f2=new Sandals(80,"casuals","puma");
        System.out.println("ANSWER FOR QUESTION 4: Sowmya Yalamarthi");
        System.out.println(f1);
        System.out.println(f2);
      
        f1.brand();
        f2.brand();
       
        
    }
    
}
