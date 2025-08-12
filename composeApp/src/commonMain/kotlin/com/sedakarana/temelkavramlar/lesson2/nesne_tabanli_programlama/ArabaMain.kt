package com.sedakarana.temelkavramlar.lesson2.nesne_tabanli_programlama

fun main() {
    var car1 = Araba("Kırmızı", 200, true)
    println("Arabanın Renk = ${car1.renk}")
    println("Arabanın Hızı = ${car1.hiz}")
    println("Arabanın Durum = ${car1.calisiyorMu}")

    var car2 = Araba("Mavi", 120, false)
    println("Arabanın Rengi, ${car2.renk}")
    println("Arabanın Hızı, ${car2.hiz}")
    println("Arabanın Durum, ${car2.calisiyorMu}")

    car1.renk = "Mor"
    println("Arabanın Renk = ${car1.renk}")


    car1.bilgiAl()
    car2.bilgiAl()
    car2.calistir()
    car2.bilgiAl()
    car2.durdur()
    car2.bilgiAl()
    car2.hizlan(200)
    car2.bilgiAl()
}