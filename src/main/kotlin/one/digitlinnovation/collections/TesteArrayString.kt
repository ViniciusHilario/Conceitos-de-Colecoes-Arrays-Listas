package one.digitlinnovation.collections

fun main() {

    //Criando o Array de String
    val nomes = Array(3) {""}

    //Populando o array
    nomes[0] = "José"
    nomes[1] = "Zazá"
    nomes[2] = "Maria"

    //Testando o array
    for(nome in nomes){

        println(nome)

    }

    println("---------------")
    //Ordena o array
    nomes.sort()
    nomes.forEach { println(it) }

    println("---------------")
    //Criando um ArrayOf de String já populando
    val nomes2 = arrayOf("Maria", "Zazá", "Pedro")
    nomes2.sort()
    nomes2.forEach { println(it) }

}