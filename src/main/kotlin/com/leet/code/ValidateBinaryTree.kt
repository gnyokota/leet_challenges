package com.leet.code

class ValidateBinaryTree {
    fun validateBinaryTreeNodes(n: Int, leftChild: IntArray, rightChild: IntArray): Boolean {
        val result = mutableListOf<Int>()
        for (x in 0 ..n) {
            result.add(0)
        }
        for (i in 0 until n) {
            if (leftChild[i] != -1) result[leftChild[i]] ++
            if (rightChild[i] != -1) result[rightChild[i]] ++
        }
        println(result.toString())
        var counter = 0
        for (x in 0 until n) {
            if (result[x] == 0) {
                counter++
                if (counter > 1) return false
            } else if (result[x] != 1) return false
        }
        return counter == 1
    }
}

fun main() {
    val inst = ValidateBinaryTree().validateBinaryTreeNodes(4, intArrayOf(1, -1, 3, -1), intArrayOf(2, -1, -1, -1))
    println(inst)
}