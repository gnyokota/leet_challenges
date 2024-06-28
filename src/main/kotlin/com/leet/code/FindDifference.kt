package com.leet.code

class FindDifference {
    fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
        var customNums1 = nums1
        var customNums2 = nums2
        for (num1 in nums1) {
            for (num2 in nums2) {
                if (num1 == num2) {
                    customNums1 = customNums1.filter { it != num1 }.toIntArray()
                    customNums2 = customNums2.filter { it != num2 }.toIntArray()
                }
            }
        }
        val result = mutableListOf<List<Int>>()
        result.add(customNums1.toSet().toList())
        result.add(customNums2.toSet().toList())
        return result
    }
}

fun main() {
    println(FindDifference().findDifference(intArrayOf(1, 2, 3, 3), intArrayOf(1, 1, 2, 2)))
}