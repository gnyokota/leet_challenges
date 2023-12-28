package com.leet.code

import kotlin.math.ceil

class NumWaterBottles {
    fun numWaterBottles(numBottles: Int, numExchange: Int): Int {
        var result = numBottles
        var numB = numBottles
        while(numB>=numExchange){
            result += numB/numExchange
            numB = (numB/numExchange) + numB % numExchange
        }
        return result
    }
}

fun main() {
    val instance = NumWaterBottles().numWaterBottles(17, 3)
    println(instance)
}