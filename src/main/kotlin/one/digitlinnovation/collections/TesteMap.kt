package one.digitlinnovation.collections

fun main() {

    //Fazendo um map
    val pair: Pair<String, Double> = Pair("João", 1000.0)
    val map1 = mapOf(pair)

    map1.forEach { (k, v) -> println("Chave: $k - Valor: $v") }

    //Fazendo outro tipo de map
    val map2 = mapOf(

        "Pedro" to 2500.0,
        "Maria" to 3000.0

    )

    println("---------------")
    map2.forEach { (k, v) -> println("Chave: $k - Valor: $v") }

}