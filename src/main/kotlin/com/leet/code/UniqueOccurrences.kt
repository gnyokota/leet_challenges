package com.leet.code


class UniqueOccurrences {
    fun uniqueOccurrences(arr: IntArray): Boolean {
        val pairKeyValue: HashMap<Int,Int> = hashMapOf()
        val set: MutableSet<Int> = HashSet()
        for(item in arr){
            pairKeyValue[item] = pairKeyValue[item]?.plus(1) ?: 1
        }

        for (item in arr) {
            pairKeyValue[item]?.let { set.add(it) }
        }
        return  set.size == pairKeyValue.values.size
    }
}
fun main(){
    val inst =  println(UniqueOccurrences().uniqueOccurrences(intArrayOf(1,2)))
}