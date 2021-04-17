/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractqn;

/**
 *
 * @author Sowmya Yalamarthi
 */
public class Triangle extends GeometricObject 
{
    private double s1;
    private double s2;
    private double s3;

    public Triangle(double s1, double s2, double s3, String color, boolean isTriangleFilled) {
        super(color, isTriangleFilled);
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }
    public double getS1() {
        return s1;
    }

    public double getS2() {
        return s2;
    }

    public double gets3() {
        return s3;
    }
   
    @Override
    public double Area()
    {
        double side= (s1+s2+s3)/2;
        return Math.sqrt(side * (side - s1) * (side - s2) * (side - s3));
        
    }
    @Override
    public double Perimeter()
    {
        return (s1+s2+s3);
    }
    @Override
    public String toString() {
        return "Triangle" + "\nfirst side: " + s1 + "\nsecond side: " + s2 + "\nthird side:" + s3 + "\nArea of Triangle is: "+Area()+"\nPerimeter of Triangle is: "+Perimeter();
    }
}
