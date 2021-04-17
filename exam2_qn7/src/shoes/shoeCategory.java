/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sowmya Yalamarthi
 */
public enum shoeCategory {
   
        FLIPFLOPS(10, 20, 30, 2021),
        SANDALS(8, 10, 28, 2020),
        SLIDERS(7, 18, 24, 2015);

        private int size;
        private int width;
        private int price;
        private int manufacturingDate;

        shoeCategory(int size, int width, int price, int manufacturingDate) {
            this.size = size;
            this.width = width;
            this.price = price;
            this.manufacturingDate = manufacturingDate;
        }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(int manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }
        
        
        public static List<shoeCategory> getShoesManufacturedAfter(int year) {
            List<shoeCategory> sc = new ArrayList<>();
            for (shoeCategory category : shoeCategory.values()) {
                if (category.manufacturingDate > year) {
                    sc.add(category);
                }
            }
            return sc;
        }
        
        public static List<shoeCategory> getShoesLessThan(double price) 
        {
            List<shoeCategory> sc1 = new ArrayList<>();
                    for (shoeCategory category : shoeCategory.values())
                    {
                if (category.price <= price) {
                    sc1.add(category);
                }
            }
            return sc1;
        }

        public double getCostOfShoes(int quantity) {
            return quantity * price;
        }
    }
    
                    

