package com.model

data class ApplicationUser(
    var id :String?=null,
    var userName :String?=null,
    var email : String?=null,
    var password :String?=null,
    var phone:String ?=null
){
    companion object{
        const val COLLECTION_NAME ="users"
    }
}
