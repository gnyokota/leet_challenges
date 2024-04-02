package com.leet.code

class LengthOfLastWord {
    fun lengthOfLastWord(s: String): Int {
        val values = s.split(" ").filter { it.isNotBlank() }
        return values[values.size-1].length
    }
}

fun main(){
   println(LengthOfLastWord().lengthOfLastWord("   fly me   to   the moon  "))
}