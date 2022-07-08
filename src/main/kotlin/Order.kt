import java.io.FileReader
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val map = mutableMapOf<String, Menu>()
    val meals = mutableListOf<Menu>()
    FileReader("mcdonalds").buffered().lines().forEach {
        val spilt = it.split(",")
        val item = Menu(spilt[1], spilt[2], spilt[3])
        map.put(spilt[0], item)
        meals.add(item)
    }
    for (key in map.keys) {
        println(key)
        map.getValue(key).printMenu()
    }
    println("Hi! Here is the menu.")

    var keep:String
    var totalPrice = 0
    do {
        val pricePerMeal = orderAny(map)
        totalPrice = pricePerMeal + totalPrice
        println("If You want to order something else, please enter 'Y'. Otherwise, please enter 'N'.")
        keep = scanner.next()
    } while (keep == "Y")

    println("Thank you for coming!")
    println("The total price of your meal is $totalPrice")
    println("Please go to the next window to check out.")

}

fun orderAny(map: MutableMap<String, Menu>): Int {
    val scanner = Scanner(System.`in`)
    println("If you want to order something, please enter the meal number: ")
    var meal = scanner.next()
    while (meal != "001" && meal != "002" && meal != "003" && meal != "004") {
        println("Received wrong number! Please try again.")
        meal = scanner.next()
    }
    var pricePerMeal = 0
    for (key in map.keys) {
        when(meal) {
            key -> {
                println("How many meals do you want? Please enter: ")
                val number = scanner.nextInt()
                pricePerMeal = number * map.getValue(key).price.toInt()
                println("The price is: $pricePerMeal")
            }
            else -> {
            }
        }
    }
    return pricePerMeal
}

data class Menu (val name:String, val calories:String, val price:String) {
    fun printMenu() {
        println("meal: $name")
        println("calories: $calories")
        println("price: $price")
        println()
    }
}
