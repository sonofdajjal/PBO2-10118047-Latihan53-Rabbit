/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118047.latihan53.rabbit;

/**
 *
 * @author 
 * Nama : Abdullah Margani
 * Nim : 10118047
 * Kelas: IF-2
 */
public class PBO210118047Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rabbit rabbit = new Rabbit("Peter", false, "grass", 4, "grey");
        String name = rabbit.getName();
        System.out.println("Hello, his name is "+name);
        System.out.println(name+" is Vegetarian? " + rabbit.isVegetarian());
        System.out.println(name+" eats "+rabbit.getEats());
        System.out.println(name+" has "+rabbit.getNoOfLegs()+" legs");
        System.out.println(name+" color is "+ rabbit.getColor());
    }
    
}
