package com.leet.code

class BracketCombinations {
    fun bracketCombinations(num: Int): Int {
        var result = 1
        for (i in 1 until num)  result = 2 * (2 * i + 1) * result / (i + 2)
        return  result
    }
}


fun main() {
    BracketCombinations().bracketCombinations(4)
}