/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

/**
 *
 * @author Sowmya Yalamarthi
 */
public class flipflops implements footwear
{
    private double quantitySold;
    private double cost;
    private static final double TAX=8;

    public flipflops(double quantitySold, double cost) {
        this.quantitySold = quantitySold;
        this.cost = cost;
    }

    public double getQuantitySold() {
        return quantitySold;
    }

    public double getCost() {
        return cost;
    }

    public static double getTAX() {
        return TAX;
    }

    @Override
    public String toString() {
        return "flipflops{" + "quantitySold=" + quantitySold + ", cost=" + cost + '}';
    }

    @Override
    public double totalCost(double quantity)
    {
        return cost*quantity;
      
    }

    @Override
    public double totalCostAfterTax(double quantity) {
        return (cost*quantity)+(cost*quantity*TAX)/100.0;
    }

    @Override
    public double totalSales() 
    {
        return totalCostAfterTax(quantitySold);
        
    }  
}
