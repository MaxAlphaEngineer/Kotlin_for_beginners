package loops

fun main(args: Array<String>) {
    for(c in "Python"){
        if (c =='o'){
            break
        }
        print(c)
    }


    println()


    val list = listOf("Book", "Tablet", "Laptop")

    for (str in list){
        if (!str.contains('o')){
            continue
        }
        println(str)
    }
}