/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gravitycalculator;

/**
 *
 * @author jlock
 */
public class GravityCalculator {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        double gravity = -9.81; // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.0;
        
        finalPosition = (0.5 * (gravity * (fallingTime * fallingTime)) + initialVelocity * fallingTime + initialPosition);
        System.out.println("The object's position after " + fallingTime +
        " seconds is " + finalPosition + " m.");
}
        
        
    }
    
//output of unmodified code, "the object's position after 10.0 seconds is 0.0m