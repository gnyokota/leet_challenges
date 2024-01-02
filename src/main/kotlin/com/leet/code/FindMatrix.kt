package com.leet.code

class FindMatrix {
    fun findMatrix(nums: IntArray): List<List<Int>> {
        val counter = IntArray(nums.size + 1)
        val result: MutableList<MutableList<Int>> =  mutableListOf();

        for (n in nums){
            if(counter[n] >= result.size){
                result.add(mutableListOf())
            }
            result[counter[n]].add(n)
            counter[n]++
        }
        return result
    }
}

fun main(){
    val inst = FindMatrix().findMatrix(intArrayOf(1,3,4,1,2,3,1))
    println(inst)
}