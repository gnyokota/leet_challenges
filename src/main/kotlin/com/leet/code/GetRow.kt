package com.leet.code

class GetRow {
    fun getRow(rowIndex: Int): List<Int> {
        val row = mutableListOf<Int>()
        for (i in 0..rowIndex) {
            row.add(0, 1)
            for (j in 1 until i) {
                row[j] = row[j] + row[j + 1]
            }
        }
        return row
    }
}

fun main(){
    val getRow = GetRow().getRow(3);
}