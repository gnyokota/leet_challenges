package com.leet.code

class CheckIfExists {
    fun checkIfExist(arr: IntArray): Boolean {
        for (i in arr.indices) {
            for (j in arr.indices) {
                if (i != j) {
                    if (arr[i] == 2 * arr[j]) {
                        return true
                    }
                }
            }
        }
        return false
    }
}

fun main() {
    val check = CheckIfExists()
    println(check.checkIfExist(intArrayOf(10, 2, 5, 3)))
}
