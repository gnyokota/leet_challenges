package com.leet.code

class Palindrome {
    fun isPalindrome(x: Int): Boolean {
        val original = x.toString()
        val reverse = x.toString().reversed()
        return original == reverse
    }

}

fun main() {
    val addTwo = Palindrome()
    addTwo.isPalindrome(-121)
}
