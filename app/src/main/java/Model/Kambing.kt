import Model.User

open class Kambing(nama:String, jenis:String, usia:String, imageUri:String): User(nama, jenis, usia, imageUri)
{
    override fun play():String{
        return "MBEEEKKKK oink"
    }

}