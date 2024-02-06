package com.example.calendriosulamericano

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform