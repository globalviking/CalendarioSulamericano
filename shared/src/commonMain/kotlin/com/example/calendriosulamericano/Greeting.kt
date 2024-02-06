package com.example.calendriosulamericano

import kotlinx.datetime.Clock
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime
import java.time.chrono.*


class Greeting {
    private val platform: Platform = getPlatform()

    fun todaysDate(): String {
        fun LocalDateTime.format() = toString().substringBefore('T')

        val now = Clock.System.now()
        val zone = TimeZone.currentSystemDefault()
        return now.toLocalDateTime(zone).format()
    }
    fun todaysSacalDate(): String {
        var kek: AbstractChronology

        val firstDayOfYear = ${todaysDate()}
        fun LocalDateTime.format() = toString().substringBefore('T')
        AbstractChronology ac
        val now = Clock.System.now()
        val zone = TimeZone.currentSystemDefault()
        return now.toLocalDateTime(zone).format()
    }

    fun todaysDate(): String {
        fun LocalDateTime.format() = toString().substringBefore('T')

        val now = Clock.System.now()
        val zone = TimeZone.currentSystemDefault()
        val gregorian_date = now.toLocalDateTime(zone).format()
    }

    fun greet(): String {
        //return "Hello, ${platform.name}!"
        return "Hoje é ${todaysDate()}!"
        retuAquário"
        return
    }
}

