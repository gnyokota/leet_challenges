package com.leet.code

class FindFirst {
    fun searchRange(nums: IntArray, target: Int): IntArray {
        val firstIndex = nums.indexOfFirst{target == it}?:-1
        val lastIndex = nums.indexOfLast{target == it}?:-1
        return intArrayOf(firstIndex,lastIndex)
    }
}

fun main() {
  val classFindFirst = FindFirst()
    classFindFirst.searchRange(intArrayOf(),8)

}
