package com.leet.code

class BracketCombinations {
    fun bracketCombinations(num: Int): Int {
        var factOne = 1
        var factTwo = 1
        var factThree = 1
        // code goes here
        for (i in num * 2 downTo 1) factOne *= i
        for (i in num + 1 downTo 1) factTwo *= i
        for (i in num downTo 1) factThree *= i

        return factOne / (factTwo * factThree)
    }
}


fun main() {
    BracketCombinations().bracketCombinations(3)
}