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
public class goldJewelry extends Jewelry
{
    private double cost;

    public goldJewelry(double cost, String type, double weight) {
        super(type, weight);
        this.cost = cost;
    }


    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "******************\ngoldJewelry" + "\ncost: " + cost + "\ntype: " + super.getType()+ "\nweight: " + super.getWeight();
    }
    
    
    
}
