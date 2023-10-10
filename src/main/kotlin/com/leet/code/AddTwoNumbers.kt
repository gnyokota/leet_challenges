package com.leet.code

import java.util.LinkedList

class AddTwoNumbers {
    fun addTwoNumbers(l1: LinkedList<Int>?, l2: LinkedList<Int>?): LinkedList<Int>? {
        val firstValue =l1?.reversed()?.joinToString("")?.toInt()!!
        val secondValue =l2?.reversed()?.joinToString("")?.toInt()!!
        val result = firstValue + secondValue
        return LinkedList(result.toString().map { it.toString().toInt()}.reversed())
     }
}

fun main() {
    val addTwo = AddTwoNumbers()
    addTwo.addTwoNumbers(linkedListOf(2,4,3), linkedListOf(5,6,4))

}

fun <T> linkedListOf(vararg items: T) = LinkedList<T>().apply {
    for (i in items) { add(i) }
}