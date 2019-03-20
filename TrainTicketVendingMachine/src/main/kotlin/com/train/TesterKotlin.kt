package com.train

fun main() {

    var isContinue = true

    while(isContinue) {
        print("Please enter number of tickets : ")
        val numberOfTickets = readLine()!!.toInt()

        if(numberOfTickets <= 0){
            println("you should book at least 1 ticket.")
            continue
        }

        print("How many round-trip tickets : ")
        val roundTrip = readLine()!!.toInt()
        val trainTicket = TrainTicket(numberOfTickets, roundTrip)

        println("Total tickets: $numberOfTickets\nRound-trip: $roundTrip" +
                "\nTotal: ${trainTicket.calculateTotalPrice()}")

        println("Continue? (Y/N)")
        var nextResult = readLine()
        isContinue = when {
            nextResult.equals("Y") -> true
            nextResult.equals("y") -> true
            nextResult.equals("N") -> false
            nextResult.equals("n") -> false
            else -> false
        }
        println("user terminate the program.")
    }
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