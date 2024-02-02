package com.leet.code

import java.util.*

class DailyTemperatures {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val result = IntArray(temperatures.size)
        val stack: Deque<Int> = LinkedList<Int>()// a decreasing stack

        for (i in temperatures.indices) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                val index = stack.pop()
                result[index] = i - index
            }
            stack.push(i)
        }
        return result
    }
}

fun main() {
    println(DailyTemperatures().dailyTemperatures(intArrayOf(73,74,75,71,69,72,76,73)))
}