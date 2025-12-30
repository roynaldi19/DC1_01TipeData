package `02TipeDataTeks`

import kotlin.text.iterator

fun main() {
    val text  = "Kotlin"
    val firstChar = text[0]

    println("First character of $text is $firstChar")

    for (char in text){
        print("$char ")
    }
}