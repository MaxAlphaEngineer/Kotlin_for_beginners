package oo

class Person {
    var name: String = "Muzaffar"
    var age: Int = 25
}

fun main(args: Array<String>) {
    val person = Person()
    println(person.name)
    println(person.age)


    person.name = "Azamat"
    person.age = 20
    println(person.name)
    println(person.age)
}