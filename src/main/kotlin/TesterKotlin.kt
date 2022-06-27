import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("Please enter number of tickets: ")
    val number = scanner.nextInt()
    println("How many round-trip tickets:  ")
    val roundTrip = scanner.nextInt()
    val a = TesterKotlin(number, roundTrip)
    a.print()
}

class TesterKotlin(val number:Int, val roundTrip:Int) {
    fun money() :Int {
        return ((number * 1000) + (roundTrip * 800))
    }
    fun print() {
        println("Total tickets: $number")
        println("Round-trip tickets: $roundTrip")
        println("One-way tickets: " + (number-roundTrip))
        println("Total: ${money()}")
    }
}