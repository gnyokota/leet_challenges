package com.leet.code

class makeValley {
    fun makeValley(arr: IntArray): IntArray {
        var L = mutableListOf<Int>()
        var R = mutableListOf<Int>()
        var side = false
        arr.sortedDescending().forEach {
            if (side) R.add(it) else L.add(it)
            side = !side
        }
        val valley = L + R.reversed()
        return valley.toIntArray()
    }
}

fun main() {
    println(makeValley().makeValley(intArrayOf(79, 35, 54, 19, 35, 25)).toList())
}