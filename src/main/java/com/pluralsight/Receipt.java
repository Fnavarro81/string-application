package com.pluralsight;

public class Receipt {
    public static void main(String[] args) {

        // Variables used:
        String itemName = "Whey Protein";
        double itemPrice = 99.99;
        int itemQuantity = 1;
        double total = itemPrice * itemQuantity;

        // Build and print:
        System.out.println("You bought " + itemQuantity + " " + itemName + " your total will be: " + total);
    }
}
