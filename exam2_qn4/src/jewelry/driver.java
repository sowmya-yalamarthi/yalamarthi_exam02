/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jewelry;

/**
 *
 * @author Sowmya Yalamarthi
 */
public class driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jewelry j1=new Jewelry("necklace",5);
        dimondJewelry dj=new dimondJewelry(500,"choker",8);
        goldJewelry gj=new goldJewelry(400,"haram",6);
        System.out.println("ANSWER FOR QUESTION 4: Sowmya Yalamarthi");
        System.out.println(j1.toString());
        System.out.println(dj.toString());
        System.out.println(gj.toString());
        
        
        // TODO code application logic here
    }
    
}
