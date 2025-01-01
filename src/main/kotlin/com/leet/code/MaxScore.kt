package com.leet.code

class MaxScore {
    fun maxScore(s: String): Int {
        var counter = 0;
        for (i in s.indices) {
            for (j in i + 1 until s.length) {
                val total =
                    s.substring(i, j).filter { i -> i.digitToInt() == 0 }.length + s.substring(
                        j,
                        s.length
                    ).sumOf { it.digitToInt() }
                if (total > counter) {
                    counter = total
                }
            }
        }
        return counter
    }
}

fun main() {
    println(MaxScore().maxScore("00"))
}