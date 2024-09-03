/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proga1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ST10447771
 */
class Customer {
    String name;
    boolean lifetimeDiscount;
    
    public Customer(String name, boolean lifetimeDiscount){
        this.name = name;
        this.lifetimeDiscount = lifetimeDiscount;
        }
    
    public String orderIceCream(ArrayList<String> iceCreamFlavors, ArrayList<Double> prices){
        Random random = new Random();
        int index = random.nextInt(iceCreamFlavors.size());
        String orderedFlavor = iceCreamFlavors.get(index);
        double price = prices.get(index);
        
        if(name.equals("Zayne")){
            price *= 0.9;
            //Apply 10% discount 
            System.out.println( name + " has a life time discount. Applying a 10% discount.");
        }
        return orderedFlavor + "$ " + String.format("%.2f", price);
    }
    
    public void scoopFlavor(ArrayList<String> iceCreamFlavors, ArrayList<Double> prices){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Available flavors: ");
        for(int i = 0; i < iceCreamFlavors.size(); i++){
            System.out.println((i + 1) + ". " + iceCreamFlavors.get(i) + " $ " + String.format("%.2f", prices.get(i)));
        }
        System.out.println("Enter the number corresponding with the flavor you want to scoop for " + name + ": ");
        int choice = scanner.nextInt();
            if(choice >= 1 && choice <= iceCreamFlavors.size()){
                String selectedFlavor = iceCreamFlavors.get(choice - 1);
                double price = prices.get( choice -1);
                
                //Code Attribution
            //This method was taken from stackoverslow
            //https://stackoverflow.com/questions/8569829/java-array-exception
            //Charlie Martin
            //https://stackoverflow.com/users/35092/charlie-martin
                if(name.equals("Zayne")){
                    System.out.println(name + " has a life time discount. Applying a 10% discount.");
                    System.out.println("You scooped " + selectedFlavor + " ice ceam for" + name + "$" + String.format("%.2f", price));
                }
            }
        
    }
    
    }
    
    