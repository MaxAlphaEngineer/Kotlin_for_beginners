package conditionals

fun main(args: Array<String>) {
    val mode: Int = 2

    val result = when(mode){
        1-> "The mode is lazy"
        2->{
            "So the mode is busy"
        }
        3-> "The mode is super-productive"
        else-> "I don't know which is mode"
    }

    println(result)

    val x = if (mode<2){
        println("Mode is less than 2")
        17
    }else{
        42
    }

    println(x)

}