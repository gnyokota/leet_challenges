package com.leet.code

class RunningSum {
    fun runningSum(nums: IntArray): IntArray {
        val result = mutableListOf<Int>()
        var sum = 0
        for(num in nums){
            sum+=num
            result.add(sum)
        }
        return result.toIntArray()
    }
}

fun main() {
RunningSum().runningSum(intArrayOf(1,2,3,4))
}