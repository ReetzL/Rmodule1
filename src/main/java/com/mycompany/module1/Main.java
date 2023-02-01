/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.module1;

import java.util.Scanner;

/**
 *
 * @author itlabs
 */
public class Main {
    public static void main(String[] args) {
        // get a number from the user (keyboard)
        int myNumber;
        Scanner fox = new Scanner(System.in);
        myNumber = fox.nextInt();
        
        // get the first left most digit
        System.out.println("first digit: " + myNumber/10000);
        System.out.println("floating point result: " + myNumber/10000.0);
        System.out.println(" second digit: " +  myNumber/1000%10);
    }
    
}
