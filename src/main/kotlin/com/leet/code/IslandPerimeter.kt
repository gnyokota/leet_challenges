package com.leet.code

class IslandPerimeter {
    fun isLandPerimeter(grid: Array<IntArray>): Int {
        var island = 0
        var surround = 0
        for (n in grid.indices) {
            for (m in  0 until grid[0].size) {
                if (grid[n][m] == 1) {
                    island++
                    if (n - 1 >= 0 && grid[n - 1][m] == 1) surround++
                    if (m - 1 >= 0 && grid[n][m - 1] == 1) surround++
                }
            }
        }
        return island * 4 - surround * 2
    }
}

fun main(){
    println(IslandPerimeter().isLandPerimeter(arrayOf(intArrayOf(0,1,0,0), intArrayOf(1,1,1,0), intArrayOf(0,1,0,0),
        intArrayOf(1,1,0,0)
    )))
}