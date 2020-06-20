package collections

fun main(args: Array<String>) {

    //Arrays

    val array = arrayOf("Namangan", "Sirdaryo", "Samarkand")
    val mixed = arrayOf("Kotlin", 17, 3.2, false)
    val numbers = intArrayOf(1,2,3,4,5)

    println(mixed[2])

    mixed[2] = 3.14
    println(mixed[2])

    val str = "Alpha"
    println(str[0])

    val regions = arrayOf("Tashkent", "Bukhara")
    val allRegions = array + regions

    println(allRegions.size)

    val empty: Boolean = numbers.isEmpty()

    println(empty)

    if (allRegions.contains("Namangan")){
        println("Chortoqliklar bormi?")
    }else{
        println("Ha maylida gaplawamiz!")
    }


}