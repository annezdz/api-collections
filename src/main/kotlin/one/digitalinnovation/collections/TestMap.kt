package one.digitalinnovation.collections

fun main(){
    val pair:Pair<String,Double> = Pair("Joao",1000.00)
    val map1 = mapOf(pair)

    /*mapOf retorna um conjunto de chave - valor */
    /*função lambda,onde para cada objeto da coleção vou consumir a chave e o valor */

    map1.forEach{(k,v) ->println("Chave: $k - Valor: $v")}

    /* recurso infixe, cria linguagens onde consegue fazer esse tipo de sintaxe, ficando mais facil e compreensivel*/
    val map2 = mapOf(
        "Anne" to 2500.00,
        "Eduardo" to 5000.00)
    map2.forEach{(k,v) -> println("Chave: $k -  Valor: $v")}


}