package one.digitlinnovation.collections

fun main() {

    val values = IntArray(5)

    values[0] = 5
    values[1] = 20
    values[2] = 10
    values[3] = 15
    values[4] = 1

    //Tipos de interações

    for(valor in values){

        println(valor)

    }

    println("----------------")
    values.forEach { valor ->

        println(valor)

    }

    println("----------------")
    for (index in values.indices){

        println(values[index])

    }

    println("----------------")
    values.sort()
    for(valor in values){

        println(valor)

    }

}