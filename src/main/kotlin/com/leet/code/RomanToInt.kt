package com.leet.code

class RomanToInt {
    fun romanToInt(s: String): Int {
        val mapOfRomans =
            mapOf("I" to 1, "V" to 5, "X" to 10, "XL" to 40, "L" to 50, "C" to 100, "D" to 500, "M" to 1000)
        var counter = 0
        for (letter in s) {
            counter += mapOfRomans.getValue(letter.toString())
        }
        if (s.contains("IV")) {
            counter -= 2
        }
        if (s.contains("IX")) {
            counter -= 2
        }
        if (s.contains("XL")) {
            counter -= 20
        }
        if (s.contains("XC")) {
            counter -= 20
        }
        if (s.contains("CD")) {
            counter -= 200
        }
        if (s.contains("CM")) {
            counter -= 200
        }
        return counter
    }
}

fun main() {
    println(RomanToInt().romanToInt("MCMXCIV"))
}