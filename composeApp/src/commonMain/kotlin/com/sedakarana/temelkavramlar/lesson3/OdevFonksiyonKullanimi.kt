package com.sedakarana.temelkavramlar.lesson3

fun main() {

    val odevFonksiyonları = OdevFonksiyonları()

    val myKm = 159.0
    val sonuc1 = odevFonksiyonları.kmtoMile(myKm)
    println("Girilen Kilometrenin Mile Değeri = $sonuc1")

    val sonuc2 = odevFonksiyonları.alanHesaplama(3, 8)
    println("Girilen Dikdörtgenin Alanı = $sonuc2")

    val sonuc3 = odevFonksiyonları.faktoriyelHesaplama(5)
    println("Faktoriye Sonucum :$sonuc3")

    val eHarfiBul = odevFonksiyonları.eBul("Bugün hava güneşliydi. Yarında öyle olacak.")
    println("Kaç Tane E Harfi Var : $eHarfiBul")

    val ucgen = odevFonksiyonları.icAciBul(3)
    println("İç Açı Toplamı = $ucgen")

    val maasHesapla = odevFonksiyonları.maasHesapla(18)
    println("Maaş = $maasHesapla")

    val otoparkHesapla = odevFonksiyonları.otoparkHesapla(4)
    println("Tutar = $otoparkHesapla")


}