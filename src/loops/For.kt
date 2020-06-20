package loops

fun main(args: Array<String>) {

    var sum: Int = 0
    for (i in 1..99) {
        sum = sum + i
    }
    println(sum)

    val list = arrayListOf("Java", "Kotlin", "Ruby")

    for (element in list){
        println(element)
    }

    for ((index, value) in list.withIndex()){
        println("Element at $index is $value")
    }
}