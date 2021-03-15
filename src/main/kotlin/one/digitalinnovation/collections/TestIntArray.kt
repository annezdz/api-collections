package one.digitalinnovation.collections

fun main(){
    /* exemplo de vetor de inteiros */
    val values = IntArray(5)
    values[0] = 1
    values[1] = 2
    values[2] = 3
    values[3] = 4
    values[4] = 5

    println("-------------------------------")
    for (valor in values)
    println(valor)

/*outra forma de percorrer usando o forEach. Nesse caso o it faz o papela
* da variável valor */

    println("-------------------------------")
    values.forEach{
        println(it)
    }

    /*Outra forma, usando o forEach mas mudando o nome da variavel it */
    println("-------------------------------")
    values.forEach{ valor ->
        println(valor)
    }

    /* Outra forma usando o index e iterando e recuperando o
    valor de cada posição
     */

    println("-------------------------------")
    for(index in values.indices){
        println(values[index])
    }

    /*Usando o Sort */

    values.sort()
    for(valor in values){
        println(valor)
    }


}