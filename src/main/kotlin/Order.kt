import java.io.FileReader
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val meals = mutableListOf<Menu>()
    FileReader("mcdonalds").buffered().lines().forEach() {
        val spilt = it.split(",")
        val item = Menu(spilt[0],spilt[1], spilt[2], spilt[3])
        meals.add(item)
    }
    meals[0].printMenu()
    meals[1].printMenu()
    meals[2].printMenu()
    meals[3].printMenu()
    println("Hi! Here is the menu.")
    var keep:String
    var sum = 0
    do {
        var perMeals = OrderAny()
        sum = perMeals + sum
        println("If You want to order something else, please enter 'Y'. Otherwise, please enter 'N'.")
        keep = scanner.next()
    } while (keep == "Y")


    println("The total money of your meal is $sum .")

}


fun OrderAny(): Int {
    val scanner = Scanner(System.`in`)
    println("If you want to order something, please enter the meal number: ")
    var meal = scanner.next()
    var moneyPerMeal:Int = 0
    if ( meal == "001" ) {
        println("How many meals do you want? Please enter: ")
        val number = scanner.nextInt()
        moneyPerMeal = number * 80
        println("The rice is: $moneyPerMeal")
    } else if ( meal == "002" ) {
        println("How many meals do you want? Please enter: ")
        val number = scanner.nextInt()
        moneyPerMeal = number * 49
        println("The  price is: $moneyPerMeal")
    } else if ( meal == "003" ) {
        println("How many meals do you want? Please enter: ")
        val number = scanner.nextInt()
        moneyPerMeal = number * 60
        println("The price is: $moneyPerMeal")
    } else if ( meal == "004" ) {
        println("How many meals do you want? Please enter: ")
        val number = scanner.nextInt()
        moneyPerMeal = number * 80
        println("The price is: $moneyPerMeal")
    } else {
        println("Received wrong number! Please try again.")
    }
    return moneyPerMeal
}

data class Menu (val id:String, val name:String, val calories:String, val price:String) {
    fun printMenu() {
        println(id)
        println("meal: $name")
        println("calories: $calories")
        println("price: $price")
        println()
    }
}