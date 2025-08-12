package com.sedakarana.temelkavramlar.lesson2

fun main() {
    val age = 19
    val name = "Seda"

    if (age >= 18) {
        println("Reşitsiniz")
    } else {
        println("Reşit Değilsiniz")
    }

    if(name == "Seda Nur"){
        println("Siz doğru Sedasınız")
    }else{
        println("Siz yanlış Sedasınız")
    }

    val user = "Admin"
    val pass = "123456"

    if(user == "Admin" && pass == "123456"){
        println("Oturum Başarlıyla Açıldı")
    }else {
        println("Hatalı Kullanıcı Adı veya Şifre")
    }


}