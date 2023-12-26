package com.leet.code

class NumRollsToTarget {
    fun numRollsToTarget(n: Int, k: Int, target: Int): Int {
        val module =   1_000_000_007
        var poss = IntArray(target + 1)
        poss[0]=1
        for(i in 1..n){
            val comb = IntArray(target + 1)
            for(j in 1..Math.min(target,i*k)){
                for(m in 1..Math.min(j,k)){
                    comb[j] = ((comb[j]-poss[j-m])%module)
                }
            }
            poss = comb
        }
        return if(poss[target]>0) poss[target] else poss[target]*-1
    }
}

fun main(){
    val instance = NumRollsToTarget().numRollsToTarget(30,30,500)
    println(instance)
}