package com.leet.code

import java.lang.StringBuilder

class MinWindowSubstring {
    fun minWindowSubstring(strArr: Array<String>): String {
        var result = ""
        for(i in strArr[0].indices){
            for(j in strArr[0].indices){
                val slice = strArr[0].substring(i,j-i+1)
                if(isSubstring(slice,strArr[1])){
                    if(result.isEmpty() || slice.length < result.length){
                        result = slice
                    }
                }
            }
        }
        // code goes here
        return result;
    }

    private fun isSubstring(str: String, subStr: String): Boolean {
        var result = ""
        for (i in str.indices) {
            result = subStr.replace(str[i].toString(),"")
        }
        return result.isEmpty()
    }
}

fun main() {
    println(MinWindowSubstring().minWindowSubstring(arrayOf("ahffaksfajeeubsne", "jefaa")))
}