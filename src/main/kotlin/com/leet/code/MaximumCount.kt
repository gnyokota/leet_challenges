package com.leet.code

class MaximumCount {
    fun maximumCount(nums: IntArray): Int {
        var negative = 0
        var positive = 0
        for (n in nums.indices) {
            if (nums[n] > 0) {
                positive += 1
            } else if (nums[n] < 0) {
                negative += 1
            }
        }
        return if (negative >= positive) negative else positive
    }
}

fun main() {
    println(MaximumCount().maximumCount(intArrayOf(-3, -2, -1, 0, 0, 1, 2)))
}