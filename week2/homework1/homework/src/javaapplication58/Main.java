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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
         * Manav dükkanı açmak isteyen bir adam hal'den bir miktar elma, bir miktar armut, bir miktar kiraz
         * alacaktır. Mallar dükkana gelmiştir. Kullanıcı bu malları ayrı odalarda saklayacaktır.
         *
         *Her bir odadaki elma, armut ve kirazın kg cinsinden değerini bulalım.
         *
         * Manav'dan online alışveriş yapılıyor. Müşteri Ve 1 kg elma, 2 kg armut almak istedi.
         * Malları alsın. depo guncellensin.
         * 
         * Online satışta müşteri depoda kalan maldan fazla bir miktarda mal almak istedi.
         * Bunu kullanıcıya bildir.
         */
        
        Apple a1 = new Apple("Elma", 20, 15);
        Pear p1 = new Pear("Armut", 15, 20);
        Cherry c1 = new Cherry("Kiraz", 15, 40);
        
        a1.storage();
        p1.storage();
        c1.storage();
        
        a1.selling(1);
        p1.selling(2);
        
        c1.selling(28);
        a1.selling(2);
        
    }
    
}
