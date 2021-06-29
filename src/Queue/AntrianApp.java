/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author Nur muhamad zaki zamani
 */
public class AntrianApp {
     public static void main(String[] args) {
        Antrian antrian = new Antrian(10);
        antrian.enqueue(40);
        antrian.display();
        antrian.enqueue(33);
        antrian.display();
        long nilai1 = antrian.peek();
        System.out.println("nilai yang paling depan = "+nilai1);
        antrian.enqueue(60);
        antrian.display();
        long nilai2 = antrian.dequeue();
        System.out.println("yang diambil dari antrian = "+nilai2);
        antrian.display();
        long nilai3 = antrian.dequeue();
        System.out.println("yang diambil dari antrian = "+nilai3);
        antrian.display();
        antrian.enqueue(54);
        antrian.display();
        long nilai4 = antrian.peek();
        System.out.println("nilai yang paling depan = "+nilai4);
        
        System.out.println("Nur muhamad zaki zamani");
    }
}
  

    

