package `04Boolean`

fun main() {
    val a = 10
    val b = 5
    val c = 10
    val d = 20

    val test1 = a > b
    println(test1) // Output: true, karena 10 lebih besar dari 5

    val test2 = a < d
    println(test2) // Output: true, karena 10 kurang dari 20

    val test3 = a <= c
    println(test3) // Output: true, karena 10 sama dengan 10

    val test4 = b >= d
    println(test4) // Output: false, karena 5 kurang dari 20
}