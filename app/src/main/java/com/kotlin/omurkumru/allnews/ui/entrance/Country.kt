package com.kotlin.omurkumru.allnews.ui.entrance

enum class Country constructor(private val countryCode: String) {
    England("en"),
    Turkey("tr"),
    USA("us"),
    Russia("ru");

    fun getCountryCode(): String {
        return countryCode
    }
}