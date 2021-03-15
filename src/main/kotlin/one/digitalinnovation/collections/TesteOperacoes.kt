package one.digitalinnovation.collections

fun main(){
    val salarios = doubleArrayOf(1000.00,2500.00,6000.00)

    for(salario in salarios){
        println(salario)
    }

    println("*****************************")
    println("max or min foram depreciados na versao atual")
    println("Maior salario é:  ${salarios.maxOrNull()}")
    println("Menor salario é:  ${salarios.minOrNull()}")
    println("Media salarial é:  ${salarios.average()}")

    /*usando o filter */

    var salariosMaiordoisMil = salarios.filter { it > 2500.00 }
    salariosMaiordoisMil.forEach{println(it)}

    /*contar quantos valores estão dentro de um Range */
    println("*****************************")
    println(salarios.count{it in 2000.00..5000.00})

    println("**********find usado para achar um campo especifico. Ex: conta bancaria*******************")
    println(salarios.find{it == 1000.00})
    println(salarios.find{it == 200.00})
    println("*****************************")
    println("O Any trás apenas se uma condição é atendida, sendo verdadeira ou falsa")
    println(salarios.any{it == 500.00})



}