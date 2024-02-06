package com.example.calendriosulamericano

class Main {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!!"
    }
}