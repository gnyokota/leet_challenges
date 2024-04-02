package com.leet.code

import java.util.*
import kotlin.collections.HashMap

class IsIsomorphic {
    fun isIsomorphic(s: String, t: String): Boolean {
        val mapS: HashMap<String, String> = hashMapOf()
        val sItems = s.split("").toTypedArray()
        val tItems = t.split("").toTypedArray()
        if (s.length != t.length) return false
        for (i in 0 until sItems.size) {
            if(mapS[sItems[i]].isNullOrBlank()){
                mapS[sItems[i]] = tItems[i]
            }else if(mapS[sItems[i]] != tItems[i]) return false
        }
        return true
    }
}


fun main() {
    println(IsIsomorphic().isIsomorphic("foo", "bar"))
}