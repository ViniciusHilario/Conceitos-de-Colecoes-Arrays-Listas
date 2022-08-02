package one.digitlinnovation.collections

//Usando Collections Mutaveis, onde os elementos podem ser mudados
fun main() {

    val joao = Funcionarios("João", 2000.0, "CLT")
    val pedro = Funcionarios("Pedro", 1500.0, "PJ")
    val maria = Funcionarios("Maria", 4000.0, "CLT")

    //Mutable List
    println("--------LIST--------")
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    //Adicionando outro elemento na list
    println("--------------------")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    //Removendo um elemento da list
    println("--------------------")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    //Mutable Set
    println("--------SET--------")
    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach { println(it) }

    //Adicionando outros elementos no Set
    println("--------------------")
    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)
    funcionarioSet.forEach { println(it) }

    //Removendo um elemento do Set
    println("--------------------")
    funcionarioSet.remove(maria)
    funcionarioSet.forEach { println(it) }

}