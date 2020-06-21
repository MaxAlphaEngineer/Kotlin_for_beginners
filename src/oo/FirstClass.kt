package oo

class Person(name: String, age: Int) {

    val name: String
    val age: Int

    init {
        this.name = name
        this.age = age
    }

    fun speak() {
        println("Hello darkness :<")
    }

    fun greet(name: String) {
        println("Hello $name!")
    }

    fun getYearOfBirth() = 2020 - age
//    fun getYearOfBirth():Int{
//        return 2020-age
//    }
}

fun main(args: Array<String>) {
    val person = Person("Azamat", 20)
    println(person.name)
    println(person.age)

    //calling method
    person.speak()
    person.greet("my friend")

    println(person.getYearOfBirth())


}