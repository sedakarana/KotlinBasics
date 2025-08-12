package com.sedakarana.temelkavramlar.lesson3

import kotlinx.coroutines.yield

class Fonksiyonlar {

    fun selamla1 (){
        val sonuc = "Merhaba Seda"
        println(sonuc)
    }

    fun selamla2 () : String{ //String türünde bir değer dönecek
        val sonuc = "Merhaba Seda"
        return sonuc
    }

    fun selamla3(name : String){
        val sonuc = "Merhaba $name"
        println(sonuc)
    }

    fun toplama(x: Int,y: Int) : Int{
        val sonuc = x+y
        return sonuc
    }

    //0verloading
    fun carpma (x: Int, y:Int){
        val sonuc = x*y
        println("İşlem Sonucu : $sonuc")
    }
    fun carpma (x: Double, y:Int){
        val sonuc = x*y
        println("İşlem Sonucu : $sonuc")
    }
    fun carpma (x: Int, y: Double){
        val sonuc = x*y
        println("İşlem Sonucu : $sonuc")
    }
    fun carpma (x: Double, y: Double){
        val sonuc = x*y
        println("İşlem Sonucu : $sonuc")
    }
    fun carpma (x: Int, y: Int,z: Int){
        val sonuc = x*y
        println("İşlem Sonucu : $sonuc")
    }


}