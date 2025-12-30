package `05Function`

fun main() {
    //built in huruf
    // Cara manual
    var name = "dicoding"
    name = "DICODING"
    println(name)

    // Cara dengan built-in function
    var anotherName = "dicoding"
    println(anotherName.uppercase())

    //builtin Angka
    // Cara manual
    val score = 80
    val scoreInDouble: Double = 80.0
    println(scoreInDouble)

    // Cara dengan built-in function
    val anotherScore = 80
    println(anotherScore.toDouble())

    //bulit in properties
    var anotherName2 = "dicoding"
    println(anotherName2.length)

    //built in campuran
    var anotherName3 = "dicoding"
    println("${anotherName3.uppercase()} has ${anotherName3.length} characters")

}