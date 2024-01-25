package com.leet.code

import java.util.*

class LongestCommon {
    fun longestCommonSubsequence(text1: String, text2: String): Int {
        val sortedText1 = text1.toList()
        var sortedText2 = text2.toList()
        val result1 = subSequence(sortedText1, sortedText2)
        val result2 = subSequence(sortedText2, sortedText1)
        return if(result1>result2) result1.length else result2.length
    }

    private fun subSequence(sortedText1: List<Char>, sortedText2: List<Char>): String {
        var result = ""
        var init = 0
        for (i in sortedText1.indices) {
            for (j in init until sortedText2.size) {
                if (sortedText2[j] == sortedText1[i]) {
                    result += sortedText1[i]
                    init = j+1
                }
            }
        }
        return result
    }
}

fun main() {
    println(LongestCommon().longestCommonSubsequence("oxcpqrsvwf", "shmtulqrypy"))
}