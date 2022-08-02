package one.digitlinnovation.collections

fun main() {

    val joao = Funcionarios("João", 2000.0, "CLT")
    val pedro = Funcionarios("Pedro", 1500.0, "PJ")
    val maria = Funcionarios("Maria", 4000.0, "CLT")

    //Criando um exemplo de List
    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach{ println(it) }

    println("---------------")
    //Encontrando um tipo de elemento na list usando .find()
    println(funcionarios.find { it.nome == "Maria" })

    println("---------------")
    //Oredenando os salarios da list usando .sortedBy()
    funcionarios.sortedBy { it.salario }.forEach{ println(it) }

    println("---------------")
    //Criando grupo de acordo com o tipoContrataçao usando .groupBy()
    funcionarios.groupBy { it.tipoContratacao }.forEach{ println(it) }

}
//Criando uma data class para teste
data class Funcionarios(

    val nome: String,
    val salario: Double,
    val tipoContratacao: String

) {

    override fun toString(): String = """        
        Nome:    $nome
        Salário: $salario        
    """.trimIndent()

}