package oo

open class People(open val name: String, open val age: Int) {

    fun speak() {
        println("Hi")
    }

    fun greet(greating: String) {
        println("Good morning $name!")
    }

    fun getYearOfBirth() = 2020 - age
}

class Student(override val name: String, override val age: Int, val id: Long) : People(name, age) {

    fun details() {
        println("Student id: $id")
    }
}

class Employee(override val name: String, override val age: Int) : People(name, age) {

}

fun main(args: Array<String>) {
    val student = Student("Azamat", 20, 12345)

    student.speak()
    student.details()

    val employee = Employee("Azizbek", 43)
    employee.greet("shi")

}