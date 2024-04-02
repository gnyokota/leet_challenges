package com.leet.code

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val indexes = mutableListOf<Int>()
        for(i in 0..nums.size){
            for(n in i+1 until nums.size){
                if(nums[i] + nums[n]== target){
                    indexes.add(i)
                    indexes.add(n)
                }
            }
        }
        println(indexes)
        return indexes.toIntArray()
    }
}

fun main(){
  println(TwoSum().twoSum(intArrayOf(3,3),6))
}