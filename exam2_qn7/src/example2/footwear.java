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
public enum footwear {
    slippers(20),shoes(10),halfShoes(30);
    private int price;

    private footwear(int price) {
        this.price = price;
    }
    
    public double getprice()
    {
        return price;
    }
    
}
