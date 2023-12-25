package com.leet.code

class DecodeWays {
    fun numDecodings(s: String): Int {
        val count = mutableListOf(1,1)
        if(s[0] == '0') return 0
        for(i in 2..s.length){
            count.add(0)

            if(s[i - 1] > '0'){
                count[i] = count[i - 1];
            }
            if(s[i - 2] == '1' || (s[i - 2]) == '2' && s[i - 1] < '7'){
                count[i] += count[i - 2];
            }
        }
        return count[s.length]
    }
}

fun main(){
    val instance =  DecodeWays().numDecodings("06")
    println(instance)
}