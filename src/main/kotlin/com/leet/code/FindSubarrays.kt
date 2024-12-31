package com.leet.code


class FindSubarrays {
    fun findSubarrays(nums: IntArray): Boolean {
        val result: MutableSet<Int> = HashSet()
        for (i in 1 until nums.size) {
            val sum = nums[i - 1] + nums[i]
            val isResult = result.add(sum)

            if (!isResult) {
                return true
            }
        }
        return false
    }
}

fun main() {
    println(
        FindSubarrays().findSubarrays(
            intArrayOf(
               2,4,2
            )
        )
    )
}