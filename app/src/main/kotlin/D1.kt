package guru.zoroark.aoc2024

import kotlin.math.abs

fun d1(input: String): Int {
    val pairs = input.lines().filter { it.isNotBlank() }.map { line ->
        line.split(Regex(" +")).map { it.toInt() }
    }
    return pairs.map { it[0] }.sorted().zip(pairs.map { it[1] }.sorted()).sumOf { abs(it.first - it.second) }
}

fun d1p2(input: String): Int{
    val pairs = input.lines().filter { it.isNotBlank() }.map { line ->
        line.split(Regex(" +")).map { it.toInt() }
    }

    val list2Frequency = pairs.map { it[1] }.fold(mutableMapOf<Int, Int>()) { map, n ->
        map[n] = (map[n] ?: 0) + 1
        map
    }
    return pairs.map { it[0] }.sumOf { it * (list2Frequency[it] ?: 0) }
}