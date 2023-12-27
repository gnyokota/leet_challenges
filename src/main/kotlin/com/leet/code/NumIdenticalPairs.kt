package com.leet.code

class NumIdenticalPairs {
    fun numIdenticalPairs(nums: IntArray): Int {
        var counter = 0
        for (i in 0 until nums.size) {
            for (j in i + 1 until nums.size)
                if (nums[i] == nums[j]) {
                    counter++
                }
        }
        return counter
    }
}

fun main() {
    val instance = NumIdenticalPairs().numIdenticalPairs(intArrayOf(1, 2, 3, 1, 1, 3))
    println(instance)
}