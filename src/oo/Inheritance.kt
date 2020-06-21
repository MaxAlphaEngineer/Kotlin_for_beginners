package oo

abstract class People(open val name: String, open val age: Int) {

    abstract fun speak()

   open fun greet() {
        println("Good morning $name!")
    }

    fun getYearOfBirth() = 2020 - age
}

class Student(override val name: String, override val age: Int, val id: Long) : People(name, age) {

    override fun speak() {
        println("Hello I am $name. I am $age years old. My student id: $id")
    }

     override fun greet() {
        super.greet()
    }

    fun details() {
        println("Student id: $id")
    }
}

class Employee(override val name: String, override val age: Int) : People(name, age) {

    override fun speak() {
        println("Hello I am $name. I am $age years old. I am employee")
    }
}

fun main(args: Array<String>) {
    val student = Student("Azamat", 20, 12345)

    student.greet()
    student.speak()

    val employee = Employee("Azizbek", 43)
    employee.speak()

}