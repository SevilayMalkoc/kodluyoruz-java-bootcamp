/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication58;

/**
 *
 * @author Asus
 */
public class Apple extends Fruit{
    
    public Apple(String name, int weight, double price) {
        super(name, weight, price);
    }

    @Override
    public void storage()
    {
        System.out.println("Depodaki elma miktarı " + super.getWeight() + " KG");
    }
}
