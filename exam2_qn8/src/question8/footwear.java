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
public abstract class footwear 
{
    private String category;
    private int numOfCatergoriesAvail;
    private int numOfBrandsAvail;
    private List<String> brandNames;
    private List<size> footwearsize;

    public footwear(String category, int numOfCatergoriesAvail, int numOfBrandsAvail, List<String> brandNames,List<size> footwearsize) 
    {
        this.category = category;
        this.numOfCatergoriesAvail = numOfCatergoriesAvail;
        this.numOfBrandsAvail = numOfBrandsAvail;
        this.brandNames = brandNames;
        this.footwearsize=footwearsize;
    }
     public String getCategory() {
        return category;
    }

    public int getNumOfCatergoriesAvail() {
        return numOfCatergoriesAvail;
    }

    public int getNumOfBrandsAvail() {
        return numOfBrandsAvail;
    }

    public List<String> getBrandNames() {
        return brandNames;
    }

    public List<size> getFootwearsize() {
        return footwearsize;
    }

    @Override
    public String toString() {
        return "footwear{" + "category=" + category + ", numOfCatergoriesAvail=" + numOfCatergoriesAvail + ", numOfBrandsAvail=" + numOfBrandsAvail + ", brandNames=" + brandNames + ", footwearsize=" + footwearsize + '}';
    }
    
    public abstract boolean isBrandAvailable(String brandNames);
     public abstract boolean isSizeAvailable(double size);
     public abstract boolean isfootwearAvailable(double size,double quantity);
    public abstract double getTotalPrice(double quantity);
    
}
