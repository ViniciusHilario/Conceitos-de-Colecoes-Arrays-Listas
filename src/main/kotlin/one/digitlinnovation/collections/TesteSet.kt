package one.digitlinnovation.collections

fun main() {

    val joao = Funcionarios("João", 2000.0, "CLT")
    val pedro = Funcionarios("Pedro", 1500.0, "PJ")
    val maria = Funcionarios("Maria", 4000.0, "CLT")

    //Criando setOf
    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)

    //Unindo funcionarios1 com funcionarios2 usando .union()
    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }

    println("---------------")
    val funcionarios3 = setOf(joao, pedro, maria)

    //Subtraindo todos os funcionarios2 de funcionarios3 usando .subtract()
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }

    println("---------------")

    //Vendo o que o funcionarios3 tem de comun com funcionarios2 usando .intersect()
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }

}