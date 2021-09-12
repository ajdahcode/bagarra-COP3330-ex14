/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 alden bagarra
 */

package org.example;
import java.util.Scanner;
import java.text.DecimalFormat;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scnN = new Scanner(System.in);
        System.out.print( "What is the order amount? " );
        double amnt = scnN.nextDouble();
        System.out.print( "What is the state? " );
        String st = scnN.next();
        double preTax = amnt;
        amnt = Math.ceil(amnt*10d)/10d;
        if(st.equals("WI")){
            double tax = preTax*0.055;
            System.out.print( "The subtotal is $"+ String.format("%.2f", preTax) +
                "\nThe tax is $"+ String.format("%.2f", tax) + "\n");
            amnt = tax+preTax;
        }
        System.out.format("The total is $%.2f", amnt);
    }
}
