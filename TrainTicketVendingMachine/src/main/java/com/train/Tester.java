package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        System.out.print("Please enter number of tickets : ");

        Scanner scanner = new Scanner(System.in);
        int numOfTickets = scanner.nextInt();

        if(numOfTickets > 0){
            System.out.print("How many round-trip tickets : ");
            int roundTrip = scanner.nextInt();

            Ticket ticket = new Ticket(numOfTickets);
            ticket.setRoundTrip(roundTrip);

            System.out.println("Total tickets: " + ticket.getNumberOfTickets() + "\nRound-trip : " + ticket.getRoundTrip()
                            + "\nTotal : " + ticket.calculateTotalPrice());
        }
        else
            System.out.println("you should book at least 1 ticket");
    }
}
