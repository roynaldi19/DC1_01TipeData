package `06NullableTypes`

fun main() {
    val text: String? = null
    val textLength = text?.length ?: "tidak diketahui"
    println(textLength)

}