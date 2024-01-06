package com.leet.code

import org.apache.logging.log4j.util.Strings.left
import java.util.*


class JobScheduling {
    fun jobScheduling(startTime: IntArray, endTime: IntArray, profit: IntArray): Int {
        val jobsTotal = profit.size
        val jobs = Array(jobsTotal) { IntArray(3) }
        for (i in 0 until jobsTotal) {
            jobs[i] = intArrayOf(startTime[i], endTime[i], profit[i])
        }
        Arrays.sort(jobs, Comparator.comparingInt { it[1] })
        val maxProfit = IntArray(jobsTotal + 1)
        for (n in 0 until jobsTotal) {
            val indexMatchStartingTime = findMatchStartingTime(jobs,jobs[n][0],n)
            maxProfit[n+1] = maxProfit[n].coerceAtLeast(maxProfit[indexMatchStartingTime] + jobs[n][2])
        }
        return maxProfit[jobsTotal]
    }

    private fun findMatchStartingTime(jobs: Array<IntArray>, startTime: Int, upperBound: Int):Int {
        var first = 0
        var last = upperBound
        while (first < last) {
            val curr: Int = first + last ushr 1
            if (jobs[curr][1] > startTime) {
                last = curr
            } else {
                first = curr + 1
            }
        }
        return if(first == 0) 0 else first-1
    }
}

fun main() {

}