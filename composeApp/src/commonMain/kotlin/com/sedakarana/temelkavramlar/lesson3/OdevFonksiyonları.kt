package com.sedakarana.temelkavramlar.lesson3

class OdevFonksiyonları {

    fun kmtoMile(km: Double): Double {
        val mile = km * 0.621
        return mile
    }

    fun alanHesaplama(kenar1: Int, kenar2: Int): Int {
        return kenar1 * kenar2
    }

    fun faktoriyelHesaplama(sayi: Int): Int {
        var sonuc = 1
        for (i in 1..sayi) {
            sonuc = sonuc * i
        }
        return sonuc
    }

    fun eBul(text: String): Int {
        var eSayacı = 0
        val myArray = text.toCharArray()
        for (i in 0..myArray.size - 1) {
            if (myArray.get(i).uppercase().contentEquals("E")) {
                eSayacı++
            }
        }
        return eSayacı
    }

    fun eBulKisa(text: String): Int {
        return text.count { it.equals('e', ignoreCase = true) }
    }

    fun icAciBul(kenarSayisi: Int): Int {
        var icAciToplami = 0
        icAciToplami = (kenarSayisi - 2) * 180
        return icAciToplami
    }

    fun maasHesapla(gunSayisi: Int): Int {
        var maas = 0
        var mevcutSaat = gunSayisi * 8
        if (mevcutSaat > 150) {
            maas = (mevcutSaat - 150) * 80 + 150 * 40
        } else {
            maas = mevcutSaat * 40
        }
        return maas
    }

    fun otoparkHesapla(saat: Int): Int {
        var odenecek = 0
        if (saat > 1) {
            odenecek = 50 + (saat - 1) * 10
        } else {
            odenecek = 50
        }
        return odenecek
    }
}