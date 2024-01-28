package com.leet.code

import javax.swing.text.html.HTML.Attribute.N



class Accum {
    fun accum(s: String): String {
        val resultList = mutableListOf<String>()
        for (i in s.indices) {
            var res: String = s[i].uppercase() + s[i].lowercase().repeat(i)
            resultList.add(res)
        }
        return resultList.joinToString("-")
    }
}

fun main() {
    println(Accum().accum("RqaEzty"))
}