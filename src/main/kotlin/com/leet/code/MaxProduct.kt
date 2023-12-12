package com.leet.code

import java.util.*

class MaxProduct {
    fun maxProduct(nums: IntArray): Int {
        Arrays.sort(nums);
        val n =  nums.size
        return (nums[n-1]-1)*(nums[n-2]-1)
    }
}

fun main(){
    println(MaxProduct().maxProduct(intArrayOf(3,4,5,2)));
}