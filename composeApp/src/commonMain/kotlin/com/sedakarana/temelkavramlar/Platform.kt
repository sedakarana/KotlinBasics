package com.sedakarana.temelkavramlar

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform