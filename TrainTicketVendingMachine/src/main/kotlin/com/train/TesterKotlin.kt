package com.train

import java.util.Scanner

fun main() {
    print("Please enter number of tickets : ")
    val scanner = Scanner(System.`in`)
    val numberOfTickets = scanner.nextInt()

    print("How many round-trip tickets : ")
    val roundTrip = scanner.nextInt()
    val trainTicket = TrainTicket(numberOfTickets, roundTrip)

    println("Total tickets: $numberOfTickets\nRound-trip: $roundTrip" +
            "\nTotal: ${trainTicket.calculateTotalPrice()}")
}

class TrainTicket(private var numberOfTickets : Int,
                  private var roundTrip: Int){

    init {
       /* println("number of tickets: $numberOfTickets")
        println("number of Round-trip tickets : $roundTrip")*/
    }

    fun calculateTotalPrice(): Int{
        val ticketPrice = 1_000
        val roundTicketPrice = 2_000 * 0.9f
        var totalPrice: Int

        totalPrice = when{
            roundTrip > 0 -> (roundTicketPrice.toInt() * roundTrip) + (numberOfTickets - roundTrip) * ticketPrice
            else -> numberOfTickets * ticketPrice
        }

        return totalPrice
    }
}