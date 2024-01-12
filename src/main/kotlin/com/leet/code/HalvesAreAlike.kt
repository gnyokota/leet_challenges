package com.leet.code

class HalvesAreAlike {
    fun halvesAreAlike(s: String): Boolean {
        val a = s.lowercase().substring(0,s.length/2)
        val b = s.lowercase().substring(s.length/2,s.length)
        val vowels = "aeiou".split("")
        var resultA = 0
        var resultB = 0
        for(letter in a){
            if(vowels.contains(letter.toString())){
                resultA++
            }
        }
        for(letter in b){
            if(vowels.contains(letter.toString())){
                resultB++
            }
        }
        return resultA == resultB
    }
}

fun main(){
    val inst = HalvesAreAlike().halvesAreAlike("textbook")
    println(inst)
}