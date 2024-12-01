package guru.zoroark.aoc2024

import kotlin.io.path.Path
import kotlin.io.path.readText

fun main() {
    val d1txt = Path("d1.txt").readText()
    println("d1: ${d1(d1txt)} / ${d1p2(d1txt)}")
}