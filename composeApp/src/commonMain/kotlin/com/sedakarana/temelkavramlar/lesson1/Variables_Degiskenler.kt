package com.sedakarana.temelkavramlar.lesson1

fun main() {
    val name = "Seda"
    println("Kullanıcı Adı : $name")

    var surName: String = "Karana"
    println("Kullanıcı Soyadı : $surName")

    println("Kullanıcı Adı Soyadı : ${name + " " + surName}")

    var number1 = 20
    var number2 = 5
    println("İşlem Sonucu : ${number1 * number2}")
}
