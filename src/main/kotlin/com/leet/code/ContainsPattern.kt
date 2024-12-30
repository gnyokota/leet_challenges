package com.leet.code

class ContainsPattern {
    fun containsPattern(arr: IntArray, m: Int, k: Int): Boolean {
        var counter = 0
       for(n in m until arr.size){
           counter = if (arr[n] == arr[n - m]) counter + 1 else 0
           if (counter == m * k - m) return true
        }
        return false
    }
}

fun main(){
    println(ContainsPattern().containsPattern(intArrayOf(1,2,1,2,1,1,1,3),2,2))
}