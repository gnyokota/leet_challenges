package com.leet.code

import kotlin.math.max


class MinSteps {
    fun minSteps(s: String, t: String): Int {
        val counter = IntArray(26)
        for (i in s.indices) {
            counter[s[i] - 'a']++
            counter[t[i] - 'a']--
        }
        var maxPositive = 0
        for (n in counter) maxPositive += max(0, n)
        return maxPositive
    }
}

fun main() {
    val inst = MinSteps().minSteps("leetcode", "practice")
    println(inst)
}