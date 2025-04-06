package com.leet.code

class DivideArray {
    fun divideArray(nums: IntArray): Boolean {
        val sorted = nums.sortedArray()
        val chunks = sorted.toList().chunked(2)
        println(chunks)
        return chunks.all { it.size >= 2 && it[0] == it[1] }
    }
}

fun main() {
    println(DivideArray().divideArray(intArrayOf(15, 13, 5, 20, 18, 2, 20, 8, 20, 17, 10, 19)))
}