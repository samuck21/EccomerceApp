package com.svstudio.eccomerceapp.domain.model

import com.google.gson.Gson
import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("id") val  id: String ? = null,
    @SerializedName("name") val  name: String ,
    @SerializedName("lastname") val  lastname: String ,
    @SerializedName("email") val  email: String,
    @SerializedName("phone") val  phone: String,
    @SerializedName("password") val  password: String,
    @SerializedName("image") val  image: String? = null,
    @SerializedName("notification_token") val  notificationToken: String? =null,
    @SerializedName("roles") val roles: ArrayList<Rol>? = null,

){
    fun toJson(): String = Gson().toJson(this)
    companion object{
        fun  fromJson(data: String): User = Gson().fromJson(data, User::class.java)
    }

}
