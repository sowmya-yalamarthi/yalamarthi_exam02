/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2_qn3;

/**
 *
 * @author Sowmya Yalamarthi
 */
public class Circle {

    private double radius;
    public static final double PI=3.14;
    

    public Circle()
    {
        
    }
    public Circle(double radius)
    {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return radius*radius*PI;
    }

    
    public double perimeterOfCircle()
    {
        return 2*PI*radius;
    }
    @Override
    public String toString() {
        return "Circle" + "\nArea of circle is: " + getArea()+"\nperimeter of circle is: "+perimeterOfCircle()+"\n*************************";
    }
    
    
}
