package com.sedakarana.temelkavramlar.lesson2

fun main() {
    //FOR DÖNGÜSÜ
    for (i in 1..3) {
        println("Döngü 1 : $i")
    }

    for (y in 10..20 step 5) {
        println("Döngü 2 : $y")
    }

    for (x in 20 downTo 10 step 5) {
        println("Döngü 3 : $x")
    }


    //WHİLE DONGÜSÜ
    var sayac = 1
    while (sayac < 11) {
        println("Döngü 4 : $sayac")
        sayac++
    }

    for (i in 1..5) {
        if(i == 3){
            break
        }
        println("Döngü 4 : $i")
    }

    for (i in 1..5) {
        if(i == 3){
            continue
        }
        println("Döngü 5 : $i")
    }

}