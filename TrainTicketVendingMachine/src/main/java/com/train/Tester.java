package com.train;

import java.util.Scanner;

public class Tester {

    private static Boolean isContinue = true;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Please enter number of tickets : ");
            int numOfTickets = scanner.nextInt();

            if(numOfTickets <= 0) {
                System.out.println("you should at least book 1 ticket.");
                continue;
            }

            System.out.print("How many round-trip tickets : ");
            int roundTrip = scanner.nextInt();

            Ticket ticket = new Ticket(numOfTickets);
            ticket.setRoundTrip(roundTrip);
            printResult(ticket);

            System.out.println("Continue ? (Y/N)");
            checkNextState(scanner.next());

        } while(isContinue);

        System.out.println("user terminate the program");
    }

    private static void printResult(Ticket ticket) {
        System.out.println("Total tickets: " + ticket.getNumberOfTickets() +
                "\nRound-trip : " + ticket.getRoundTrip() +
                "\nTotal : " + ticket.calculateTotalPrice());
    }

    private static void checkNextState(String nextResult) {
        if(nextResult.equals("Y") || nextResult.equals("y"))
            isContinue = true;
        else if(nextResult.equals("N") || nextResult.equals("n"))
            isContinue = false;
    }
}
