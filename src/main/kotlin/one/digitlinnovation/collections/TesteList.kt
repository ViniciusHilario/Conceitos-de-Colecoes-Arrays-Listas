package one.digitlinnovation.collections

fun main() {

    val joao = Funcionarios("João", 1000.0)
    val pedro = Funcionarios("Pedro", 2000.0)
    val maria = Funcionarios("Maria", 4000.0)

    //Criando um exemplo de List
    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach{ println(it) }

    println("---------------")
    println(funcionarios.find { it.nome == "Maria" })
}
//Criando uma data class para teste
data class Funcionarios(

    val nome: String,
    val salario: Double

) {

    override fun toString(): String = """
        
        Nome:    $nome
        Salário: $salario
        
    """.trimIndent()

}