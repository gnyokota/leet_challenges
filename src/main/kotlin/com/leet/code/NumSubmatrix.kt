package com.leet.code

class NumSubmatrix {
    fun numSubmatrixSumTarget(matrix: Array<IntArray>, target: Int): Int {
        var count = 0
        val row = matrix.size
        val column = matrix[0].size + 1
        val sum = Array(row) { IntArray(column) }
        for (i in sum.indices) {
            for (j in 1 until sum[0].size) {
                sum[i][j] = sum[i][j - 1] + matrix[i][j - 1]
            }
        }

        for (s in 0 until column) {
            for (e in s + 1 until column) {
                var sumOfSubMatrix = 0
                val mapSum = hashMapOf<Int, Int>()
                mapSum[0] = 1
                for (sub in 0 until row) {
                    sumOfSubMatrix += sum[sub][e] - sum[sub][s]
                    if (mapSum.containsKey(sumOfSubMatrix - target)) {
                        count += mapSum[sumOfSubMatrix - target]!!
                    }
                    mapSum[sumOfSubMatrix] = mapSum.getOrDefault(sumOfSubMatrix, 0) + 1
                }
            }
        }
        return count
    }
}

fun main() {
    println(
        NumSubmatrix().numSubmatrixSumTarget(
            arrayOf(intArrayOf(0, 1, 0), intArrayOf(1, 1, 1), intArrayOf(0, 1, 0)),
            0
        )
    )
}