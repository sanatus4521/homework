package com.train;

import java.util.Scanner;

public class Tester {
    int number;
    int roundTrip;
    int oneWay;

    public Tester(int number, int roundTrip) {
        this.number = number;
        this.roundTrip = roundTrip;
        this.oneWay = number - roundTrip;
    }

    public int money() {
        int money = (roundTrip * 1800) + (oneWay * 1000);
        return money;
    }

    public void print() {
        System.out.println("Total tickets: " + number);
        System.out.println("Round-trip: " + roundTrip);
        System.out.println("One-way: " + oneWay);
        System.out.println("Total: " + money());
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
