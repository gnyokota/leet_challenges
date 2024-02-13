package com.leet.code

class FirstPalindrome {
    fun firstPalindrome(words: Array<String>): String {
        var result = ""
        for (word in words) {
            if (word == word.reversed()) {
                result += word
               break
            }
        }
        return result
    }
}

fun main() {
    val inst = FirstPalindrome().firstPalindrome(arrayOf("notapalindrome","ada","racecar"))
    println(inst)
}