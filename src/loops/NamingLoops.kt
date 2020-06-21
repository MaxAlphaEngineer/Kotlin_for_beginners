package loops

fun main(args: Array<String>) {

   outer@ for (i in 1..10){
        for (j in 1..10){
            if (i - j ==5){
                println("$i - $j")
                println("Break")
                break@outer
            }

        }

    }
}