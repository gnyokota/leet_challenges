package com.leet.code

class RotateString {
    fun rotateString(s: String, goal: String): Boolean {
        var isRotated = false
        var shift = s
        for (i in s.indices) {
            shift = shift.substring(1, shift.length) + shift[0]
            if (shift == goal) {
                isRotated = true
                break
            }
        }
        return isRotated
    }
}

fun main() {
    println(RotateString().rotateString("abcde", "cdeab"))
}