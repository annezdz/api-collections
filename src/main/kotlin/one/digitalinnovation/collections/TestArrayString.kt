package one.digitalinnovation.collections

fun main(){

    val nomes = Array(3){" "}
    nomes[0] = "Marina"
    nomes[1] = "Dudu"
    nomes[2] = "Edu"

    println("*****************************")

    for(nome in nomes){
        println(nome)
    }

    println("*****************************")
    nomes.forEach(){
        print(it)
    }
    println("*****************************")
    nomes.forEach{nome ->
    println(nome)
    }
    println("*****************************")

    for(index in nomes.indices){
        println(nomes[index])

    }
    println("*****************************")

    nomes.sort()
    for(nome in nomes){
        println(nome)
    }

    /*
    forma menos verbosa
     */

    val nomes2 = arrayOf("Anne", "Ana", "Tutu", "Lulu")
    nomes2.sort()
    nomes2.forEach{println(it)}
}