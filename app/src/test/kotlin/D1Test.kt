package guru.zoroark.aoc2024

import kotlin.test.Test
import kotlin.test.assertEquals

class D1Test {
    @Test
    fun `Test D1`() {
        val input = """
            3   4
            4   3
            2   5
            1   3
            3   9
            3   3
        """.trimIndent()
        assertEquals(11, d1(input))
    }

    @Test
    fun `Test D1 P2`() {
        val input = """
            3   4
            4   3
            2   5
            1   3
            3   9
            3   3
        """.trimIndent()
        assertEquals(31, d1p2(input))
    }
}