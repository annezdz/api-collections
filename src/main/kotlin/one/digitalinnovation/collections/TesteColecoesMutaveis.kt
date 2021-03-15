package one.digitalinnovation.collections

fun main(){
    val joao = Funcionario("Joao das Neves",2500.0,"PJ")
    val maria = Funcionario("Maria dos Doces",1000.0,"CLT")
    val dudu = Funcionario("Dudo do Sonic",15000.0,"PJ")

    val funcionarios = mutableListOf(joao,maria)
    funcionarios.forEach{println(it)}

    println("********************")
    funcionarios.add(dudu)
    funcionarios.forEach{println(it)}

    println("********************")
    funcionarios.remove(maria)
    funcionarios.forEach{println(it)}

    println("********set************")
    val funcionariosSet = mutableSetOf(maria)
    //funcionariosSet.forEach{println(it)}
    funcionariosSet.add(joao)
    funcionariosSet.add(dudu)
    funcionariosSet.forEach{println(it)}


}