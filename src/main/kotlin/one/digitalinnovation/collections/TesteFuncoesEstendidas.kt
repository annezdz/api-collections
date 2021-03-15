package one.digitalinnovation.collections

fun main(){

    val salario = arrayOf(
        "2000.00".toBigDecimal(),
        "4000.00".toBigDecimal(),
        "6000.00".toBigDecimal()
    )
    println("**************************")
    println(salario.somatoria())
    println("**************************")
    println(salario.media())

}