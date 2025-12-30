package `03TipeDataAngka`

fun main() {
    val angka1 = 10
    val angka2 = 5
    val angka3 = 2

    val hasilTanpaKurung = angka1 + angka2 * angka3
    println("Hasil Tanpa Kurung: $angka1 + $angka2 * $angka3 = $hasilTanpaKurung")

    val hasilDenganKurung = (angka1 + angka2) * angka3
    println("Hasil Dengan Kurung: ($angka1 + $angka2) * $angka3 = $hasilDenganKurung")

    val hasilLain = angka1 / angka2 + angka3 * angka2
    println("Hasil Lain: $angka1 / $angka2 + $angka3 * $angka2 = $hasilLain")
}