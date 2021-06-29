/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author Nur muhamad zaki zamani
 */
public class TumpukanApp {
     public static void main (String [] args) {
        Tumpukan tumpukan= new Tumpukan(10);
        tumpukan.push(8);
        tumpukan.baca();
        tumpukan.push(30);
        tumpukan.baca();
        tumpukan.baca();
        long nilai1 = tumpukan.peek();
        System.out.println("Nilai Tertinggi = "+ nilai1);
        System.out.println("Nama saya Nur Muhamad Zaki Zamani ");
        long nilai2 = tumpukan.pop();
        System.out.println("nilai yang dihapus = "+nilai2);
        tumpukan.push(40);
        tumpukan.baca();
        tumpukan.push(50);
        tumpukan.baca();

        
        
        
        
      }
        
}
