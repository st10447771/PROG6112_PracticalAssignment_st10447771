/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proga1;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author ST10447771
 */
public class FreezerBunny {
    
    public static void main(String[] args){
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Charlie", false));
        customers.add(new Customer("Mason", false));
        customers.add(new Customer("Zayne", true));
        
        ArrayList<String> iceCreamFlavors = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
                iceCreamFlavors.add("Vanilla");
                prices.add(2.50);
                iceCreamFlavors.add("Chocolate");
                prices.add(3.50);
                iceCreamFlavors.add("Pistachio");
                prices.add(5.00);
                
                
                //Code Attribution
            //This method was taken from stackoverslow
            //https://stackoverflow.com/questions/17043422/java-randomly-selecting-from-already-defined-integers
            //Ruchira Gayan Ranaweera
            //https://stackoverflow.com/users/1869846/ruchira-gayan-ranaweera
                //Randomly select a customer to order
                Random random = new Random();
                int customerIndex = random.nextInt(customers.size());
                Customer selectedCustomer = customers.get(customerIndex);
                
                //Display the order of the randomly selected customer
                System.out.println(selectedCustomer + " ordered " + selectedCustomer.orderIceCream(iceCreamFlavors, prices) + " ice cream.");
                                
                //Let the user scoop for the customer
                selectedCustomer.scoopFlavor(iceCreamFlavors, prices);
    }
    
}
