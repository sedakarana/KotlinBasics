package com.sedakarana.temelkavramlar.lesson2

fun main() {
    val day = 4

    when (day){
        1->println("Pazartesi")
        2->println("Sali")
        3->println("Çarşamba")
        4->println("Perşembe")
        5->println("Cuma")
        6->println("Cumartesi")
        7->println("Pazar")
        else->println("Bir gün değildir")
    }
}