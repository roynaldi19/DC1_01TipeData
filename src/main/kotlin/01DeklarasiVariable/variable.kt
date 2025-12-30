package `01DeklarasiVariable`

fun main() {
    var companyName: String= "Dicoding"
    companyName = "Dicoding Academy" // Pada jenis variabel val, nilai inisial adalah hal yang wajib. Di sisi lain, nilai inisial adalah hal yang opsional pada jenis variabel var.

    val companyName2 = "Dicoding" //best practice type data tidak perlu di tulis
    //companyName2 = "Dicoding Academy" 		// Error: Val cannot be reassigned

}