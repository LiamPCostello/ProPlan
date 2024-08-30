package CurrencyConverter;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


            System.out.println("***************************************");
            System.out.println("  £  €  $  CURRENCY EXCHANGE  $  €  £  ");
            System.out.println();
            System.out.println("Please enter a currency you would like to exchange: ");

            System.out.println("1) GBP (£)");
            System.out.println("2) EUR (€)");
            System.out.println("3) USD ($)");


            // take input from user
            Scanner scan = new Scanner(System.in);
            System. out.println("Choose the currency");
            int choice = scan.nextInt();
            System.out.println("Enter the amount");
            double amount = scan.nextDouble();

            // convert the amount
            switch (choice) {
                case 1:
                    GBPToOther(amount);
                    break;
                case 2:
                    EURToOther(amount);
                    break;
                case 3:
                    USDToOther(amount);
                    break;
                default:
                    System.out.println("Invalid choice");
            }


    }

    private static void GBPToOther(double amt) {
        System.out.println("1 Pound Sterling = " + 1.13 + " Dollar");
        System.out.println();
        System.out.println(amt+" Pound Sterling = " + (amt*1.13) + " Dollar");
        System.out.println();
        System.out.println("1 Pound Sterling = " + 1.19 + " Euro");
        System.out.println();
        System.out.println(amt+" Pound Sterling = " + (amt*1.19) + " Euro");
        System.out.println();

    }

    private static void EURToOther(double amt) {
        System.out.println("1 Euro = " + 0.84 + "Pound Sterling");
        System.out.println();
        System.out.println(amt+" Euro = " + (amt*0.84) + "Pound Sterling");
        System.out.println();
        System.out.println("1 Euro = " + 1.11 + " Dollar");
        System.out.println();
        System.out.println(amt+" Euro = " + (amt*1.11) + " Dollar");
    }

    private static void USDToOther(double amt) {
        System.out.println("1 Dollar = " + 0.76 + "Pound Sterling");
        System.out.println();
        System.out.println(amt+" Dollar = " + (amt*0.76) + "Pound Sterling");
        System.out.println();
        System.out.println("1 Dollar= " + 0.90 + " Euro");
        System.out.println();
        System.out.println(amt+" Dollar = " + (amt*0.90) + " Euro");
    }



}
