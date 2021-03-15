package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("Joao das Neves",2500.0,"PJ")
    val maria = Funcionario("Maria dos Doces",1000.0,"CLT")
    val dudu = Funcionario("Dudo do Sonic",15000.0,"PJ")

    //Como se cria instancias de conjunto, de set//

    val funcionarios = setOf(joao,maria)
    val funcionarios2 = setOf(dudu)
    //usando o Union
    println("***************************************")
    var resultUnion = funcionarios.union(funcionarios2)
    resultUnion.forEach{println(it)}

    println("***************************************")
    val funcionarios3 = setOf(joao,maria,dudu)
    var resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }

    println("***************************************")
    var resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }



}