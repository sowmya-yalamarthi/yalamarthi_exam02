/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footwear;

/**
 *
 * @author Sowmya Yalamarthi
 */
public class Sandals extends footWear
{
    
    private double price;

    public Sandals(double price, String type, String brand) {
        super(type, brand);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    @Override
     public void brand()
    {
        System.out.println("brand price"+price);
    }
    @Override
    public String toString() {
        return "Sandals " + "\nprice: " + price ;
    }   
}
