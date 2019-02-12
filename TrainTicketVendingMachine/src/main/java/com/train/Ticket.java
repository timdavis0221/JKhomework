package com.train;

public class Ticket {

    private int numberOfTickets;
    private int roundTrip = 0;

    public Ticket(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public int calculateTotalPrice(){

        int ticketPrice = 1000;
        int roundTicketPrice = (int)(2000 * 0.9f);
        int totalPrice;

        if(roundTrip > 0 && roundTrip <= numberOfTickets)
            totalPrice = (roundTrip * roundTicketPrice) + (numberOfTickets - roundTrip) * ticketPrice;
        else
            totalPrice = numberOfTickets * ticketPrice;

        return totalPrice;
    }

    public void setRoundTrip(int roundTrip) {
        this.roundTrip = roundTrip;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public int getRoundTrip() {
        return roundTrip;
    }
}
