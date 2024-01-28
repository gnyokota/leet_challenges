package com.leet.code

class LongestCommon {
    fun longestCommonSubsequence(text1: String, text2: String): Int {
        val sortedText1 = text1.toList()
        var sortedText2 = text2.toList()
        val result1 = subSequence(sortedText1, sortedText2)
        val result2 = subSequence(sortedText2, sortedText1)
        return if (result1 > result2) result1.length else result2.length
    }

    private fun subSequence(text1: List<Char>, text2: List<Char>): String {
        var result = ""
        var init = 0
        for (i in text1.indices) {
            for (j in init until text2.size) {
                if (text2[j] == text1[i]) {
                    result += text1[i]
                    init = j + 1
                    println(init)
                }
            }
        }
        println(result)
        return result
    }
}

fun main() {
    println(LongestCommon().longestCommonSubsequence("oxcpqrsvwf", "shmtulqrypy"))
}