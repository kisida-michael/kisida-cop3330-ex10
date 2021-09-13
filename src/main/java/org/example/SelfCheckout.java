package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Kisida
 */

import java.util.Scanner;
public class SelfCheckout
{
    public static void main( String[] args )
    {
        final double taxPercent = .055;
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter the price of item 1: ");
        int item1price = input.nextInt();  // Read user input
        System.out.print("Enter the quantity of item 1: ");
        int item1qty  = input.nextInt();  // Read user input
        System.out.print("Enter the price of item 1: ");
        int item2price = input.nextInt();  // Read user input
        System.out.print("Enter the quantity of item 1: ");
        int item2qty  = input.nextInt();  // Read user input
        System.out.print("Enter the price of item 1: ");
        int item3price = input.nextInt();  // Read user input
        System.out.print("Enter the quantity of item 1: ");
        int item3qty  = input.nextInt();  // Read user input
        double subtotal = (item1price * item1qty) + (item2price * item2qty) + (item3qty * item3price);
        double tax = subtotal * taxPercent;
        double total = subtotal + tax;
        String output1 = String.format("Subtotal: $%.2f\nTax: $%.2f\nTotal: $%.2f", subtotal, tax, total);
        System.out.println(output1);
        input.close();
    }
}
