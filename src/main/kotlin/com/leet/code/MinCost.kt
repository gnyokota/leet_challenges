package com.leet.code

class MinCost {
    fun minCost(colors: String, neededTime: IntArray): Int {
     var index = -1
        var minTime = 0
        val colorsArr =  colors.split("").drop(1).dropLast(1)
        for(i in colors.indices){
            if(index ==-1 || colorsArr[index] != colorsArr[i]){
                index = i
            }else{
                if (neededTime[index]<neededTime[i]){
                    minTime+=neededTime[index]
                    index = i
                }else{
                    minTime+=neededTime[i]
                }
            }
        }
        return minTime
    }
}

fun main(){
    val instance =  MinCost().minCost("abaac", intArrayOf(1,2,3,4,5))
    println(instance)
}