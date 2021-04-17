/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sowmya Yalamarthi
 */
public class driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("ANSWER FOR QUESTION 8: Sowmya Yalamarthi \n");
        List<String> brands=new ArrayList<String>();
        brands.add("puma");
        brands.add("nike");
        brands.add("addidas");
        brands.add("under armour");
        
        size size1=new size(8,12);
        size size2=new size(8.5,15);
        List<size> sizes=new ArrayList<size>();
        sizes.add(size1);
        sizes.add(size2);
        shoes s1=new shoes(40,"sport shoe",23,5,brands,sizes);
        
        System.out.println("Brands avilable "+s1.getBrandNames().toString());
        System.out.println("sizes available ");
        for(size s3:s1.getFootwearsize())
        {
        System.out.println(s3.toString());
        }
        System.out.println(s1.isBrandAvailable("puma"));
        System.out.println(s1.isSizeAvailable(8));
        System.out.println(s1.isfootwearAvailable(9, 2));
        System.out.println("total price: "+s1.getTotalPrice(2));
    }
    
}
