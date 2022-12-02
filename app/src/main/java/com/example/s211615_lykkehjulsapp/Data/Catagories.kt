package com.example.s211615_lykkehjulsapp.Data


data class Catagories  (
    val category: String,
    val  hiddenWord: String
    )

    object Data {
    val wordlist: List<Catagories> =
        listOf(
        Catagories("sport", "tennis"),
        Catagories("sport", "swimming"),
        Catagories("fruit", "apple"),
        Catagories("fruit","Banana"),
        Catagories("country", "denmark"),
        Catagories("country", "sweden"))

}