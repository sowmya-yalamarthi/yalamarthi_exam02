/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

import java.util.List;

/**
 *
 * @author Sowmya Yalamarthi
 */
public class shoes extends footwear
{
    private double price;
    private static final double discount=0.2;
    public shoes(double price,String category, int numOfCatergoriesAvail, int numOfBrandsAvail, List<String> brandNames,List<size> footwearsize) {
        super(category, numOfCatergoriesAvail, numOfBrandsAvail, brandNames,footwearsize);
        this.price=price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean isBrandAvailable(String brandNames) {
        List<String> bnames=getBrandNames();
                
        if(bnames!=null&&bnames.contains(brandNames))
        {
            return true;
        }
        else
            return false;
    }

    @Override
    public boolean isSizeAvailable(double size) {
       List<size> s;
        s=getFootwearsize();
        if(s!=null)
        {
           for(size s1:s)
           {
               if(s1.getSize()==size&&s1.getQuantity()>0)
                   return true;
           }
        }
        return false;
    }

    @Override
    public boolean isfootwearAvailable(double size, double quantity) {
        List<size> avil;
        avil=getFootwearsize();
        if(avil!=null)
        {
           for(size s1:avil)
           {
               if(s1.getSize()==size&&s1.getQuantity()>=quantity)
                   return true;
           }
        }
        return false;
    }

    @Override
    public double getTotalPrice(double quantity) {
        return (price*quantity)-(price*quantity*discount)/100.0;
        
    }

    @Override
    public String toString() {
        return "shoes{" + "price=" + price + '}';
    }    
}
