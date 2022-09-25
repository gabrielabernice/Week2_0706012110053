import Model.User

open class Sapi(nama:String, jenis:String, usia:String, imageUri:String):User(nama, jenis, usia, imageUri)
{
    override fun play():String{
        return "MOOOOOOOOO oink"
    }

}