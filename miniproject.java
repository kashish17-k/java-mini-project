/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

       import java.util.Scanner;
       public class ATMsimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int PIN = 2004;     
        int p;
        double balance = 10000;    

        System.out.print("Enter your ATM PIN: ");
        p = sc.nextInt();

        
        if (p != PIN) {
            System.out.println("Invalid PIN! Access Denied.");
            return;
        }
        else{
            System.out.println("LOGIN SUCCESSFULL");
        }

        int choice;
        do {
            System.out.println("\n====== ATM MENU ======");
            System.out.println("1. Balance Inquiry");
            System.out.println("2. Cash Withdrawal");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Your Current Balance: " + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();

                    if (withdrawAmount > balance) {
                        System.out.println("Insufficient Balance!");
                    } else if (withdrawAmount <= 0) {
                        System.out.println("Invalid Amount!");
                    } else {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawal Successful!");
                        System.out.println("Remaining Balance: " + balance);
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();

                    if (depositAmount <= 0) {
                        System.out.println("Invalid Amount!");
                    } else {
                        balance += depositAmount;
                        System.out.println("Deposit Successful!");
                        System.out.println("Updated Balance: " + balance);
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 4);

       
    }
}
