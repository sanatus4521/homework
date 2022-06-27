package com.train;

import java.util.Scanner;

public class Tester {
    int number;
    int roundTrip;
    int money;

    public Tester(int number, int roundTrip) {
        this.number = number;
        this.roundTrip = roundTrip;
        this.money = (number * 1000) + (roundTrip * 800);
    }

    public void print() {
        System.out.println("Total tickets: " + number);
        System.out.println("Round-trip: " + roundTrip);
        System.out.println("One-way: " + (number - roundTrip));
        System.out.println("Total: " + money);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of tickers: ");
        int number = scanner.nextInt();
        System.out.println("How many round-trip tickets: ");
        int roundTrip = scanner.nextInt();
        Tester a = new Tester(number, roundTrip);
        a.print();

    }
}
