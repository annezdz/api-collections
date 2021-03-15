package one.digitalinnovation.collections

fun main(){
    val joao = Funcionario("Joao das Neves",2500.0,"PJ")
    val maria = Funcionario("Maria dos Doces",1000.0,"CLT")
    val dudu = Funcionario("Dudo do Sonic",15000.0,"PJ")

    val repositorio = Repositorio<Funcionario>()
    repositorio.create(joao.nome,joao)
    repositorio.create(maria.nome,maria)
    repositorio.create(dudu.nome,dudu)

    println(repositorio.findById(joao.nome))

    println("***********************************")
    repositorio.findAll().forEach {println(it) }

    println("***********************************")
    repositorio.remove(joao.nome)
    repositorio.findAll().forEach{println(it)}

}