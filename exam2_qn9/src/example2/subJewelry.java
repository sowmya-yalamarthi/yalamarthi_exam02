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
public class subJewelry implements jewelry 
{
    private double weight;
    private double cost;
    public static final double TAX=8;

    public subJewelry(double weight, double cost) {
        this.weight = weight;
        this.cost = cost;
    }
    
    @Override
    public double price() 
    {
        return cost*weight;
        
    }

    @Override
    public String jewelryType() {
        return "dimond jewelry";
    }

    @Override
    public double totalcost() 
    {
        return price()+(price()*TAX)/100.0;
        
    }
    
    
}
