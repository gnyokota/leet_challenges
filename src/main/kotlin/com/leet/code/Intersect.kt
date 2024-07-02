package com.leet.code

import java.util.*
import java.util.stream.Collectors
import kotlin.streams.toList


class Intersect {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val ans: MutableList<Int> = ArrayList()
        val set: MutableSet<Int> = nums1.toMutableSet()
        for (num in nums2) if (set.remove(num)) ans.add(num)
        return ans.stream().mapToInt { obj: Int -> obj.toInt() }.toArray()
    }
}

fun main(){
    println(Intersect().intersect(intArrayOf(4,9,5), intArrayOf(9,4,9,8,4)))
}