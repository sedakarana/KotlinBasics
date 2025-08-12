package com.sedakarana.temelkavramlar.lesson3

fun main() {
    val sonuc = 5.carpi(3)
    val sonuc1 = 10.carpi(0)
    val sonuc3 = 2 toplama 5
    val sonuc4 = 80 toplama 5

}

fun Int.carpi (sayi1:Int): Int{
    return this*sayi1
}

infix fun Int.toplama(sayi1: Int): Int{
    return this+sayi1
}