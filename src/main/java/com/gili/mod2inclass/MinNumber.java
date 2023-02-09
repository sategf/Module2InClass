/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gili.mod2inclass;

/**
 *
 * @author Acer10
 */
import java.util.Scanner;
public class MinNumber {
    //5.11
    
    public static void main(String[] args) {
        Scanner intScan = new Scanner(System.in);
        System.out.println("How many numbers would you like to input?: ");
        
        int numberOfInts = intScan.nextInt();
        int min = 0;
        
        for (int i=1; i <= numberOfInts; i++){
            System.out.println("Enter the " + i+ordSuffix(i) + " num:");
            int current = intScan.nextInt();
            if(current < min || i == 1 ) {
                min = current;
            }
        }
        System.out.println("The smallest is: " + min);
    }
    public static String ordSuffix(int num) {
        //correct ordinal suffix generator
        String suffix = new String();
        int numLastDig = num % 10;
        if (numLastDig == 0 ||  numLastDig > 3 || (num > 9 && num < 14) ) {
            suffix = "th";
        }
        else if (numLastDig == 1 ) {
            suffix = "st";
        }
        else if (numLastDig == 2 ) {
            suffix = "nd";
        }
        else if (numLastDig == 3) {
            suffix = "rd";
        }
        
        return suffix;
    }
}
 