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
public class Pear extends Fruit{
    public Pear(String name, int weight, double price) {
        super(name, weight, price);
    }

    @Override
    public void storage()
    {
        System.out.println("Depodaki armut miktarı " + super.getWeight() + " KG");
    }
}
