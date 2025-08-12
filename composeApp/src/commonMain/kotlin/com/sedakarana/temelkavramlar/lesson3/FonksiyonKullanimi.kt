package com.sedakarana.temelkavramlar.lesson3

fun main() {
    val fonksiyonlar = Fonksiyonlar()
    fonksiyonlar.selamla1()

    val gelenDeger = fonksiyonlar.selamla2()
    println(gelenDeger)

    fonksiyonlar.selamla3("Ezgi")

    val toplamaSonucu = fonksiyonlar.toplama(10,58)
    println("Toplam Sonucumuz = $toplamaSonucu")




}