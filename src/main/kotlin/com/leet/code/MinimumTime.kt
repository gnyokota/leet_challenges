package com.leet.code

import java.util.ArrayDeque
import java.util.Arrays
import java.util.Queue
import java.util.function.Supplier
import java.util.stream.Collectors
import java.util.stream.IntStream


class MinimumTime {
    fun minimumTime(n: Int, relations: Array<IntArray>, time: IntArray): Int {
        val graph: Array<MutableList<*>?> = arrayOfNulls(n)
        val inDegree = IntArray(n)
        val dist = time.clone()

        for (i in 0 until n) graph[i] = ArrayList()

        for (r in relations) {
            val u = r[0] - 1
            val v = r[1] - 1
            graph[u].add(v)
            ++inDegree[v]
        }

        val q: Queue<Int> = IntStream.range(0, n)
            .filter { i: Int -> inDegree[i] == 0 }
            .boxed()
            .collect(Collectors.toCollection(Supplier { ArrayDeque() }))

        while (!q.isEmpty()) {
            val u = q.poll()
            for (v in graph[u]) {
                dist[v] = Math.max(dist[v], dist[u] + time[v])
                if (--inDegree[v] == 0) q.offer(v)
            }
        }

        return Arrays.stream(dist).max().getAsInt()

    }
}

fun main() {

}