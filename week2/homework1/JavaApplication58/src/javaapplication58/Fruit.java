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
public  class Fruit {
    public String name;
    public int weight;
    public double price;

    public Fruit(String name, int weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > this.weight)
            System.out.println("Depoda kalan üründen fazla sipariş verdiniz. Satın alabileceğiniz maksimum " + this.name + " miktarı " + this.weight + " KG");
        else
        {
            this.weight -= weight;
            System.out.println(weight + " KG " + this.name + " Aldınız. Depoda kalan " + this.name + " miktarı " + this.weight + " KG");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public  void storage(){
        return ;
    }
    

    public void selling(int _weight)
    {
        setWeight(_weight);
        if (_weight < this.weight)
            System.out.println("Alışveriş tutarınız: " + (_weight * this.getPrice()));
    }
}
