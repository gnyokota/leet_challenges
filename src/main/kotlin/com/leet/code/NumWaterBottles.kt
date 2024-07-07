package com.leet.code

import kotlin.math.floor

class NumWaterBottles {
    fun numWaterBottles(numBottles: Int, numExchange: Int): Int {
        var result = numBottles
        var drinked = numBottles
        while(drinked>=numExchange){
            result += drinked/numExchange
            drinked = (drinked/numExchange) + drinked % numExchange
        }
        return result
    }
}

fun main() {
    print(NumWaterBottles().numWaterBottles(15, 4))
}