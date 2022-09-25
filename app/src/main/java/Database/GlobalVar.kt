package Database

import Model.User

class GlobalVar {
    companion object{
        val STORAGE_PERMISSION_CODE: Int = 100
        val listDataHewan = ArrayList<User>()
        val filterDataHewan = ArrayList<User>()
        var run: String = ""
    }
}