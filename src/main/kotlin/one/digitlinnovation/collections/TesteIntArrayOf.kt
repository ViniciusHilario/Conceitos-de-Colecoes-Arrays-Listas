package one.digitlinnovation.collections

fun main() {

    //Criando IntArrayOf
    val values = intArrayOf(2, 6, 8, 4, 10)

    //Testando o IntArrayOf
    values.forEach {

        println(it)

    }

    println("---------------")
    //Ordena o Array
    values.sort()
    values.forEach {

        println(it)

    }

}