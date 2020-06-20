package conditionals

fun main(args: Array<String>) {
    val x = 11
    when (x) {
        5 -> println("x: " + 5)
        3 * 12 -> println("x: " + 3 * 12)
        "Hey there".length -> println("x is equals stirng 'Hey there' " + "Hey there".length)
        !in 1..9 -> println("x is not between 1 and 9")
        in 1..10 -> println("x is between 1 and 10")
    }
}