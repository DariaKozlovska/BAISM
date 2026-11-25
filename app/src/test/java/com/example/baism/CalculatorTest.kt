package com.example.bsaism

import org.junit.Assert.assertEquals
import org.junit.Test

class CalculatorTest {
    @Test
    fun add_returnsSum() {
        assertEquals(6, add(2, 2))
    }
}