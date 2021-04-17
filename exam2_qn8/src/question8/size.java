/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

/**
 *
 * @author Sowmya Yalamarthi
 */
public class size {
    private double size;
private double quantity;

    public size(double size, double quantity) {
        this.size = size;
        this.quantity = quantity;
    }

    public double getSize() {
        return size;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "size: " + size + "  quantity: " + quantity ;
    } 
}
