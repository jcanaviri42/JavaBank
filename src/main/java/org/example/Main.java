package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        double balance = 1000.0;
        ArrayList<String> transactionHistory = new ArrayList<>();

        balance = deposit(500, balance, transactionHistory);
        balance = withdraw(100, balance, transactionHistory);

        System.out.println("Balance final: $" + balance);
        for (String transaction : transactionHistory)
            System.out.println(transaction);
    }

    public static double deposit(double amount, double balance, ArrayList<String> transactionHistory) {
        if (amount > 0) {
            transactionHistory.add("Deposited: $" + amount);
            return balance + amount;
        }
        return balance;
    }

    public static double withdraw(double amount, double balance, ArrayList<String> transactionHistory) {
        if (balance >= amount) {
            balance -= amount;
            transactionHistory.add("Withdrew: $" + amount);
            return balance;
        }
        System.out.println("Insufficient funds");
        return balance;
    }
}
