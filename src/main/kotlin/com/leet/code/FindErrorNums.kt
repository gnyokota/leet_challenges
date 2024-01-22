package com.leet.code

class FindErrorNums {
    fun findErrorNums(nums: IntArray): IntArray {
        val size = nums.size //4
        var sum = size * (size + 1) / 2 //10
        val result = IntArray(2)
        val seen = BooleanArray(size + 1) //5
        for (num in nums) {
            sum -= num
            if (seen[num]) result[0] = num
            seen[num] = true
        }
        result[1] = sum + result[0]
        return result
    }
}

fun main() {
    val inst = FindErrorNums().findErrorNums(intArrayOf(1,2,2,4))
}