package com.example.myapplication.data


data class Room (    var id : Int=0){
    lateinit var name :String
    var deviceList= mutableListOf<AddedDevice>()
}