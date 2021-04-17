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
public class Jewelry 
{
    private String type;
    private double weight;

    public Jewelry(String type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "******************\nJewelry" + "\ntype: " + type + "\nweight: " + weight ;
    }
}
