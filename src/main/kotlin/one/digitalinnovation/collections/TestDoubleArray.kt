package one.digitalinnovation.collections

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1000.00
    salarios[1] = 2000.00
    salarios[2] = 3000.00


    salarios.forEach { println(it) }

    /*quando se deseja mudar, por exemplo, o valor que
    esta em cada posição esse exemplo já nos dá o foreach indexado.

     */
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it) }

    val salarios2 = doubleArrayOf(500.0, 1000.0, 2500.00, 100.00)
    salarios2.forEach { println(it) }
}