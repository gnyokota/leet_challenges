package com.leet.code

class Check {
    fun check(nums: IntArray): Boolean {
        var result = 0
        for (i in nums.indices) {
            if (nums[i] > nums[(i + 1) % nums.size]) {
                ++result
            }
        }
        return result <= 1
    }
}

fun main() {
    val input = intArrayOf(3, 4, 5, 1, 2)
    println(Check().check(input))
}