package com.sedakarana.temelkavramlar.lesson2.nesne_tabanli_programlama

class Araba(var renk: String, var hiz: Int, var calisiyorMu: Boolean) {
    init {
        println("Çalıştır ")
    }
    fun bilgiAl() {
        println("***********************************")
        println("Arabanın Renk = ${this.renk}")
        println("Arabanın Hızı = ${this.hiz}")
        println("Arabanın Durum = ${this.calisiyorMu}")
    }

    fun calistir() {
        calisiyorMu = true
        hiz = 150
    }

    fun durdur() {
        calisiyorMu = false
        hiz = 0
    }

    fun hizlan(km: Int) {
        hiz += km
    }
}