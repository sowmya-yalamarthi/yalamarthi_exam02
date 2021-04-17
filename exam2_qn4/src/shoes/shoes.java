/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoes;

/**
 *
 * @author Sowmya Yalamarthi
 */
public class shoes {
   
    public static class Shoe
    {
        public static void shoe(){
      System.out.println("shoe category");
        }
    }

    public static class runningShoes extends Shoe
    {
       
        public static void shoe()
        {
            System.out.println("sub category of shoes is running shoes");
        }
    }
    public static class casualShoes extends Shoe
    {
       
        public static void shoe()
        {
            System.out.println("sub category of shoes is casual shoes");
        }
    }
    public static void main(String[] args)
    {
        Shoe s1=new Shoe();
        Shoe s2=new runningShoes();
        Shoe s3=new casualShoes();
        System.out.println("ANSWER FOR QUESTION 4: Sowmya Yalamarthi \n");
        s1.shoe();
        s2.shoe();
        s3.shoe();
    }
    
    
}
