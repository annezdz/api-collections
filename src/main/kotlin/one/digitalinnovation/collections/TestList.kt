package one.digitalinnovation.collections

fun main(){

    println("Esses exemplos de lista NÃO são mutáveis")
    val joao = Funcionario("Joao das Neves",2500.0,"PJ")
    val maria = Funcionario("Maria dos Doces",1000.0,"CLT")
    val dudu = Funcionario("Dudo do Sonic",15000.0,"PJ")


    println("Melhor  modo de fazer uma lista de objetos")
    val funcionarios = listOf(joao,maria,dudu)
    /*o IT agora representa o funcionario, que é uma instancia de um objeto
    * referenciado em uma variavel ali em cima alocado em uma
    *  posição dentro da nossa lista */
    funcionarios.forEach{println(it)}

    println("Encontrando um nome dentro de uma lista de onjetos")
    println(funcionarios.find { it.nome == "Maria dos Doces" })

    println("Usando o Sorted By == encadeamento")
    println("foreach (operação coletora) finaliza todas as operações que estão sendo atreladas " +
            "a nossa coleção. No exemplo a gente está ordenando por salario")
    funcionarios
        .sortedBy{it.salario}
        .forEach{println(it)}

    println("GroupBy == emitir um relatorio de funcionarios que sao PJ ou CLT." +
            "Quando se pede para agrupar foi criado um mapa onde todos os tipos" +
            "que eu tenha e encontre elementos com aquele tipo, ele é alocado em chaves " +
            "em adicionados em uma lista")
    funcionarios
        .groupBy{it.tipo}
        .forEach{println(it)}

}
data class Funcionario(
    val nome:String,
    val salario:Double,
    val tipo:String
    ){
    override fun toString(): String =
        """
            Nome:$nome
            Salario:$salario
            """.trimIndent()
    }

