package com.kotlin.omurkumru.allnews.ui.entrance

enum class Catagory constructor(private val catagoryCode: String) {
    All("all"),
    Business("business"),
    Entertainment("entertainment"),
    General("general"),
    Health("health"),
    Science("science"),
    Sports("sports"),
    Technology("technology");

    fun getCatagoryCode(): String {
        return catagoryCode
    }
}