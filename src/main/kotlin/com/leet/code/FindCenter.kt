package com.leet.code

class FindCenter {
    fun findCenter(edges: Array<IntArray>): Int {
        val edgesFlatten = edges.flatMap { it.asIterable() }
        val edgeMaps = mutableMapOf<Int,Int>()
        var result = 0
        for(edge in edgesFlatten){
            val counter = edgeMaps.getOrDefault(edge, 0)
            edgeMaps[edge] = counter + 1
        }
        for (keyValue in edgeMaps){
            if(keyValue.value == edges.size){
                result = keyValue.key
            }
        }
        return result
    }
}

fun main(){
 println(FindCenter().findCenter(arrayOf(intArrayOf(1,2), intArrayOf(2,3), intArrayOf(4,2))))
}