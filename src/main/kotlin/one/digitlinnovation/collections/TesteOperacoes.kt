package one.digitlinnovation.collections

fun main() {

    val salarios = doubleArrayOf(1500.0, 4000.0, 2500.0)

    for(salario in salarios){

        println(salario)

    }

    println("--------------")
    //saber qual é o maior valor usando .max()
    println("Maior salário: ${salarios.max()}}")

    //saber qual é o menor valor usando .min()
    println("Menor salário: ${salarios.min()}}")

    //saber qual é a média do array usando .average()
    println("Média salarial: ${salarios.average()}}")

    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    println("--------------")
    salariosMaiorQue2500.forEach{ println(it) }

    println("--------------")
    //saber quantos valores tem com uma determinada condição usando .count
    println(salarios.count{it in 2000.0 .. 5000.0})

    println("--------------")
    //encontrar um valor determinado no array usando .find
    println(salarios.find { it == 2500.0 })
    println(salarios.find { it == 2250.0 })

    println("--------------")
    //saber se é verdadeiro ou não uma condição usando .any
    println(salarios.any { it == 1500.0 })
    println(salarios.any { it == 500.0 })

}