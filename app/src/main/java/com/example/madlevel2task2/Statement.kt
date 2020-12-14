package com.example.madlevel2task2

data class Statement(
    var text: String,
    var answer: Boolean
) {
    companion object{
        val STATEMENTS = arrayOf(
            "A circle is round",
            "A whale is smaller than a snail",
            "Amsterdam is the capital of the Netherlands",
            "Water is denser than oil",
            "Speed is faster than sound",
            "The first moon landing was in 1912"
        )

        val STATEMENT_ANSWERS = arrayOf(
            true,
            false,
            true,
            true,
            true,
            false
        )
    }
}