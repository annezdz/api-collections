package one.digitalinnovation.collections

fun main() {
    val map = mapOf(1 to "x", 2 to "y", 3 to "z")
    println(map)

    val map1 = emptyMap<String, Int>()
    println("map.isEmpty() is ${map1.isEmpty()}")

    val anotherMap = mapOf<String, Int>()
    println("map1 == anotherMap is ${map1 == anotherMap}")


    val items = listOf("apple", "banana", "kiwifruit")
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }
    println("************************************************ /n")
    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach { println(it) }


    val lista = listOf(1,2,3,4,-1,-10)

    val positives = println(lista.filter {it > 0 })

}

class Retangle(var height:Double, var lenght:Double){
    var perimeter = (height + lenght) * 2

}
