/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1;

import java.util.*;
import java.txt.Currency;
import java.txt.Locale;
import java.txt.NumberFormat;
import java.lang.Math;
import java.text.NumberFormat;
/**
 *
 * @author e
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //initializing scanner object
        Scanner in = new Scanner(System.in);
        
        //taking user input for radius
        double radius = 0.0;
        while(radius < 10.0 || radius > 15.0){
            System.out.print("Please enter the radius of the fontain (10.0 to 15.0) feet: ");
            radius = in.nextDouble();
            if(radius < 10.0 || radius > 15.0){
                System.out.println("(INCORRECT VALUE DETECTED. Please enter a value between 10.0 and 15.0)");
            }
        }
       
        //taking user input for x width
       double xwidth = 0.0;
        while(xwidth < 2.0 || xwidth > 8.0){
            System.out.print("Please enter the rectangular pedestal’s x-axis width (2.0 to 8.0 feet): ");
            xwidth = in.nextDouble();
            if(xwidth < 2.0 || xwidth > 8.0){
                System.out.println("(INCORRECT VALUE DETECTED. Please enter a value between 2.0 and 8.0)");
            }
        }
       
        //taking user input for y width
        double ywidth = 0.0;
        while(ywidth < 2.0 || ywidth > 8.0){
            System.out.print("Please enter the rectangular pedestal’s y-axis width (2.0 to 8.0 feet): ");
            ywidth = in.nextDouble();
            if(ywidth < 2.0 || ywidth > 8.0){
                System.out.println("(INCORRECT VALUE DETECTED. Please enter a value between 2.0 and 8.0)");
            }
        }
        
        //taking user input for depth
        double depth = 0.0;
        while(depth < 1.0 || depth > 3.0){
            System.out.print("Please enter the water’s depth when full (1.0 to 3.0 feet): ");
            depth = in.nextDouble();
            if(depth < 1.0 || depth > 3.0){
                System.out.println("(INCORRECT VALUE DETECTED. Please enter a value between 1.0 and 3.0)");
            }
        }
        
        
        //calculating the volume of the cylinder
        double cyl = Math.pow(radius, 2) * Math.PI;
        
        //calculating the volume of the rectangular prism
        double rec_prism = xwidth * ywidth * depth;
        
        //calculations needed for the problem!
        double totalVol = cyl - rec_prism;
        double totalGal = totalVol * 7.481;
        
        //prints the necessary values
        System.out.println("Water Volume in cubic feet: " + totalVol);
        System.out.println("Water Volume in gallons: " + totalGal);
        
        //calculating the price by rounding up to a whole number and multiplying by 10 cents
        totalGal = Math.ceil(totalGal);
        double cost = totalGal * 0.10; 
        //properly formatting the number to a currency
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.CANADA);
        String totalCost = nf.format(cost);
        //printing the final total price
        System.out.println("That amount of water will cost: " + totalCost);
    }
    
}
