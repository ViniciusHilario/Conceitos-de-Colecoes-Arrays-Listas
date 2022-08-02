package one.digitlinnovation.collections

//Fazendo os testes com o map mutavel
fun main() {

    val joao = Funcionarios("João", 2000.0, "CLT")
    val pedro = Funcionarios("Pedro", 1500.0, "PJ")
    val maria = Funcionarios("Maria", 4000.0, "CLT")

    val repositorio = Repositorio<Funcionarios>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(maria.nome))

    println("------------------")
    repositorio.findAll().forEach { println(it) }

    println("------------------")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach { println(it) }

}