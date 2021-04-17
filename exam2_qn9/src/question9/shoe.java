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
public class shoe implements footwear
{
    private String color;
    private double quantitySold;
    private double cost;
    private static final double TAX=9;

    public shoe(String color, double quantitySold, double cost) {
        this.color = color;
        this.quantitySold = quantitySold;
        this.cost = cost;
    }

    public String getColor() {
        return color;
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
        return "shoe{" + "color=" + color + ", quantitySold=" + quantitySold + ", cost=" + cost + '}';
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
