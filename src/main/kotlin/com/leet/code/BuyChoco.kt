package com.leet.code

class BuyChoco {
    fun buyChoco(prices: IntArray, money: Int): Int {
        prices.sort()
        val result = prices[0]+prices[1]
        return if(money-result < 0) money else money-result

    }
}

fun main(){
    val inst =  BuyChoco().buyChoco(intArrayOf(1,2,2),3)
    println(inst)
}