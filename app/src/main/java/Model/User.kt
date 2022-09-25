package Model

open class User(
    nama: String,
    jenis: String,
    usia: String,
    imageUri: String

) {
    var nama: String = nama
    var jenis: String = jenis
    var usia: String = usia
    var imageUri: String = imageUri

    fun food(g: Biji): String{
        return "Aku makan biji bijian"
    }

    fun food(a: Rumput): String{
        return "Aku makan rumput"
    }

    open fun play(): String{
        return ""
    }

}