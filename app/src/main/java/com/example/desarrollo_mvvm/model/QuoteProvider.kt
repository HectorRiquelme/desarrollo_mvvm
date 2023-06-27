package com.example.desarrollo_mvvm.model

import kotlin.random.Random

class QuoteProvider {

    companion object {

        fun random():QuoteModel{
            val position =  Random.nextInt(5)
            //val position: Int = (0..10).random()
            return quote[position]
        }

        private val quote = listOf<QuoteModel>(
            QuoteModel(
                quote = "cita a",
                author = "autor a"
            ),
            QuoteModel(
                quote = "cita b",
                author = "autor b"
            ),
            QuoteModel(
                quote = "cita c",
                author = "autor c"
            ),
            QuoteModel(
                quote = "cita d",
                author = "autor d"
            ),
            QuoteModel(
                quote = "cita e",
                author = "autor e"
            ),
            QuoteModel(
                quote = "cita f",
                author = "autor f"
            )
        )
    }

}