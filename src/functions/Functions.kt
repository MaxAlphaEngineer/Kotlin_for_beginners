package functions

import java.util.*

fun main(args: Array<String>) {
    helloWorld()
    printWithSpaces("Kotlin")
    println()
    println(getCurrentDate())

    println(max(17, 42))
}

//No parameters, no return value
fun helloWorld() {
    println("Hello world")
}

// 1 parameters, no return value
fun printWithSpaces(text: String) {
    for (c in text) {
        print(c + " ")
    }
}

//No parameters, returns Date
fun getCurrentDate(): Date {
    return Date()
}

//2 parameters, returns Int value
fun max(a: Int, b: Int): Int {
    return if (a >= b)
        a
    else
        b
}