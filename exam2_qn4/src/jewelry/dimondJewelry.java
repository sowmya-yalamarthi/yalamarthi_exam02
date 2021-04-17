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
public class dimondJewelry extends Jewelry
{
    private double price;

    public dimondJewelry(double price, String type, double weight) {
        super(type, weight);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "******************\ndimondJewelry" + "\nprice: " + price + "\ntype: " + super.getType()+ "\nweight: " + super.getWeight();
    }
    
    
    
}
