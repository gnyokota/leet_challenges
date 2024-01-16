package com.leet.code

import java.util.*

class RandomizedSet(
        private val mapValue: HashMap<Int, Int> = hashMapOf(),
        private val randomValue: Random = Random(),
        private val result: MutableList<Int> = mutableListOf()
) {

    fun insert(`val`: Int): Boolean {
        if (!mapValue.containsKey(`val`)) {
            result.add(`val`)
            mapValue[`val`] = result.size - 1
            return true
        }
        return false
    }

    fun remove(`val`: Int): Boolean {
        val index = mapValue.getOrDefault(`val`, -1)
        if (index == -1) return false
        Collections.swap(result, index, result.size - 1)
        val valueSwitch = result[index]
        mapValue[valueSwitch] = index
        result.removeAt(result.size - 1)
        mapValue.remove(`val`)
        return true
    }

    fun getRandom(): Int {
        val randomIndex = randomValue.nextInt(result.size)
        return result[randomIndex]
    }
}