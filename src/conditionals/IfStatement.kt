package conditionals

fun main(args: Array<String>) {
    val age: Int = 19
    if (age < 18) {
        println("You can't register")
    } else if (age < 21) {
        println("Well you too")
    } else if (age < 27) {
        println("Old geek is here")
    } else {
        println("You are good to go!")
    }
    println("End of class!")
}
