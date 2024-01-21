package com.leet.code

import java.util.*

class Rob {
    fun rob(nums: IntArray): Int {
        val numSize = nums.size
        if (numSize == 1) {
            return nums[0]
        }
        if (numSize == 0) {
            return 0
        }
        if (numSize == 2) {
            return Math.max(nums[0], nums[1])
        }
        val result = IntArray(numSize)
        result[0] = nums[0]
        result[1] = nums[1]
        result[2] = nums[0] + nums[2]

        for (i in 3 until numSize) {
            result[i] = Math.max(result[i - 2], result[i - 3]) + nums[i]
        }
        return Math.max(result[numSize - 1], result[numSize - 2])
    }
}

fun main() {
    val inst = Rob().rob(intArrayOf(1, 3, 1))
    println(inst)
}