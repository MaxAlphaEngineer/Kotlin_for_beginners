package oo

class Person {
    var name: String = "Muzaffar"
    var age: Int = 25

    fun speak(){
        println("Hello darkness :<")
    }
    fun greet(name: String){
        println("Hello $name!")
    }

    fun getYearOfBirth() = 2020 -age
//    fun getYearOfBirth():Int{
//        return 2020-age
//    }
}

fun main(args: Array<String>) {
    val person = Person()
    println(person.name)
    println(person.age)

    //calling method
    person.speak()
    person.greet("my friend")

    println(person.getYearOfBirth())

    //re-assign class parameters
    person.name = "Azamat"
    person.age = 20
    println(person.name)
    println(person.age)
}