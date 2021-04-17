/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

import java.util.Scanner;

/**
 *
 * @author Sowmya Yalamarthi
 */
public class peopleDriver 
{
    public static void main(String[] args)
    {
        System.out.println("ANSWER FOR QUESTION 5 : Sowmya Yalamarthi ");
        Person p1=new Person("Abhi","texas","8374836444","abhi123@gmail.com");
       
      Student stu1=new Student("A","sai","virginia","8734864764","sai@gmail.com");
      Employee emp = new Employee("ch1200", 50000 , "6/5/2008","sowmya","maryville","49758978533","abc@gmail.com");

      Faculty f1 = new Faculty("10am-5pm",3, "Professor",40000,"2/22/2004","siri","texas","86486858465",
			"siri@gmail.com");

      Staff s1 = new Staff("Admin assistant", "ch3600", 40000,"8/23/2010","james","florida", "387437434744","james@gmail.com");
      
		System.out.println(p1.toString());
		System.out.println(stu1.toString());
		System.out.println(emp.toString());
		System.out.println(f1.toString());
		System.out.println(s1.toString());
     }
}
