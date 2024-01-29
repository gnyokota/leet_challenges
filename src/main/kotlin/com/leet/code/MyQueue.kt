package com.leet.code

import java.util.*
import kotlin.collections.ArrayDeque


class MyQueue(private val init: ArrayDeque<Int> = ArrayDeque()) {
    fun push(x: Int) {
        init.addLast(x)
    }

    fun pop(): Int {
        peek()
        return init.removeFirst()
    }

    fun peek(): Int {
        return init.first()
    }

    fun empty(): Boolean {
        return init.isEmpty()
    }
}

fun main(){
    val myQueue =  MyQueue()
    println(myQueue.push(1)) // queue is: [1]
    print(myQueue.push(2)) // queue is: [1, 2] (leftmost is front of the queue)
    println(myQueue.peek()) // return 1
    println(myQueue.pop()) // return 1, queue is [2]
    println(myQueue.empty())
}