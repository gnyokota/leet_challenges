package com.leet.code

class Decrypt {
    fun decrypt(sentence: String, searchWord: String): Int {
        val items = sentence.split(" ")
        var result = -1
        for (n in 0 until items.size) {
            if (items[n].startsWith(searchWord)) {
                result = n + 1
                break
            }
        }
        return result
    }
}

fun main() {
    print(Decrypt().decrypt("i love eating burger", "burg"))
}