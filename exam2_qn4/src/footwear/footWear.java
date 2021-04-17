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
public class footWear 
{
    private String type;
    private String brand;
   

    public footWear(String type, String brand) {
        this.type = type;
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public void brand()
    {
        System.out.println("Brand Name "+brand);
    }

    @Override
    public String toString() {
        return "footWear{" + "type=" + type + ", brand=" + brand + '}';
    }
    
    
    
}
