package loops

fun main(args: Array<String>) {
    val numbers = listOf<Int>(1, 2, 4, 5, 7, 8, 9, 23, 26)

    println(reverse(numbers))
    println(reverse2(numbers))
}


fun reverse(list: List<Int>): List<Int> {
    val result = arrayListOf<Int>()

    for (i in 0..list.size - 1) {
        result.add(list.get(list.size-1 - i))
    }

    return result
}

fun reverse2(list: List<Int>):List<Int>{
    val result = arrayListOf<Int>()
    for (i in list.size-1 downTo 0){
        result.add(list.get(i))
    }

    return result
}