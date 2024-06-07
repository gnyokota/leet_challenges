package com.leet.code

class ReplaceWords {
    fun replaceWords(dictionary: List<String>, sentence: String): String {
        val words = sentence.split(" ").toMutableList()
        for(root in dictionary){
            for (word in words){
                if(word.startsWith(root)){
                    words[words.indexOf(word)] = root
                }
            }
        }
        return words.joinToString(" ")
    }
}

fun main(){
    println(ReplaceWords().replaceWords(listOf("cat","bat","rat"),"the cattle was rattled by the battery"))
}