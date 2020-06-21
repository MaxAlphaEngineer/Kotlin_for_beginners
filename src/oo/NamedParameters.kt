package oo

class House(private val height: Double, private val color: String, private val price: Int = 5000) {

    fun details() {
        println("\tHouse details")
        println("-----------------------")
        println("height: $height \n" +
                "color: $color \n" +
                "price: $$price\n")
    }
}

fun main(args: Array<String>) {
    val house = House(height = 4.5, color = "white", price = 15000)

    val redHouse = House(height = 5.0, color = "red", price = 20000)
    val yellowHouse = House(height = 5.0, color = "yellow")

    house.details()
    redHouse.details()
    yellowHouse.details()

}