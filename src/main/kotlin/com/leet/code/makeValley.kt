package com.leet.code

class makeValley {
    fun makeValley(arr: IntArray): IntArray {
        var left = mutableListOf<Int>()
        var right = mutableListOf<Int>()
        var side = false
        arr.sortedDescending().forEach {
            if (side) right.add(it) else left.add(it)
            side = !side
        }
        val valley = left + right.reversed()
        return valley.toIntArray()
    }
}

fun main() {
    println(makeValley().makeValley(intArrayOf(79, 35, 54, 19, 35, 25)).toList())
}