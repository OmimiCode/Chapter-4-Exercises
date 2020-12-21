package Chapter4;
//4.18 (Credit Limit Calculator) Develop a Java application that determines whether any of several
//        department-store customers has exceeded the credit limit on a charge account. For each customer,
//        the following facts are available:
//        a) account number
//        b) balance at the beginning of the month
//        c) total of all items charged by the customer this month
//        d) total of all credits applied to the customer’s account this month
//        e) allowed credit limit.
//        The program should input all these facts as integers, calculate the new balance (= beginning balance
//        + charges – credits), display the new balance and determine whether the new balance exceeds the
//        customer’s credit limit. For those customers whose credit limit is exceeded, the program should dis-
//        play the message "Credit limit exceeded" .

import javax.swing.*;
import java.util.Scanner;

import java.util.Arrays;



public class CreditLimitCalculator {

    private int accountNumber;
    public int balance;
    public int charges;
    public int credit;
    public int credit_limit;
    public int newBalance;
    int customer = 1;
//        private String displayDetails;

    //Scanner scanner = new Scanner(System.in);

    public void setAccountNumber() {
        //System.out.println("ENTER ACCOUNT NUMBER");
        //scanner.nextInt();
        int accountNumber = Integer.parseInt(JOptionPane.showInputDialog("ENTER ACCOUNT NUMBER"));
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;

    }

    public void setBalance() {
        //System.out.println("ENTER INITIAL BALANCE FOR THE MONTH");
        //scanner.nextInt();
        int balance = Integer.parseInt(JOptionPane.showInputDialog("ENTER INITIAL BALANCE FOR THE MONTH"));
        this.balance = balance;
    }

    public int getBalance() {
        System.out.println(balance);
        return balance;
    }

    public void setCharges() {
        // System.out.println("ENTER TOTAL NUMBER OF ALL ITEMS CHARGED BY THE CUSTOMER THIS MONTH");
        //scanner.nextInt();
        int charges = Integer.parseInt(JOptionPane.showInputDialog("ENTER TOTAL NUMBER OF ALL ITEMS CHARGED BY THE CUSTOMER THIS MONTH"));
        this.charges = charges;
    }

    public int getCharges() {
        return charges;
    }

    public void setCredit() {
        //System.out.println("ENTER TOTAL NUMBER OF ALL CREDIT APPLIED TO THE CUSTOMER'S ACCOUNT THIS MONTH");
        //scanner.nextInt();
        int credit = Integer.parseInt(JOptionPane.showInputDialog("ENTER TOTAL NUMBER OF ALL CREDIT APPLIED TO THE CUSTOMER'S ACCOUNT THIS MONTH"));
        this.credit = credit;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit_limit() {
        // System.out.println("ENTER ALLOWED CREDIT LIMIT");
        //scanner.nextInt();
        int credit_limit = Integer.parseInt(JOptionPane.showInputDialog("ENTER ALLOWED CREDIT LIMIT"));
        this.credit_limit = credit_limit;
    }

    public int getCredit_limit() {
        return credit_limit;
    }

    public void setNewBalance() {
        this.newBalance = newBalance;
    }

    public int getNewBalance() {
        int newBalance = balance + charges - credit;
        System.out.println(
                "CUSTOMER " + customer + " DETAILS " + "\n" +
                        "==================================" + "\n" +
                        "account number: " + accountNumber + "\n" +
                        "account balance: " + balance + "\n" +
                        "charges: " + charges + "\n" +
                        "credit: " + credit + "\n" +
                        "credit_limit: " + credit_limit + "\n" +
                        "==================================" + "\n" +
                        "NEW BALANCE : " + newBalance + "\n" +
                        "==================================" + "\n");
        System.out.println(": " + newBalance);
        return newBalance;


    }



    public static void main(String[] args) {
        CreditLimitCalculator creditLimit = new CreditLimitCalculator();

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter customer ID number OR -1 to terminate ");
        int customerID = scanner.nextInt();


        while (customerID != -1) {
            creditLimit.setAccountNumber();
            creditLimit.setBalance();
            creditLimit.setCharges();
            creditLimit.setCredit();
            creditLimit.setCredit_limit();
            creditLimit.getNewBalance();

            if (creditLimit.newBalance > creditLimit.credit_limit){
                System.out.println("CREDIT LIMIT EXCEEDED");
            } else {
                System.out.println("CREDIT LIMIT NOT EXCEEDED");
            }


            creditLimit.customer++;
            System.out.println("enter customer ID number OR -1 to terminate");
            customerID = scanner.nextInt();


        }
    }
}

