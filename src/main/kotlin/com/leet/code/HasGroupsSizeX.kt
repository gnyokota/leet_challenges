package com.leet.code

class HasGroupsSizeX {
    fun hasGroupsSizeX(deck: IntArray): Boolean {
        if (deck.size == 1) return false
        val counter: MutableMap<Int, Int> = mutableMapOf()
        var res = 0
        for (n in deck.indices) {
            counter[deck[n]] = counter.getOrDefault(deck[n], 0) + 1
        }
        for (i in counter) res = commonDiv(i.value, res)
        return res > 1
    }

    fun commonDiv(a: Int, b: Int): Int {
        return if (b > 0) commonDiv(b, a % b) else a
    }
}

fun main() {
    println(HasGroupsSizeX().hasGroupsSizeX(intArrayOf(1, 1, 2, 2, 2, 2)))
}