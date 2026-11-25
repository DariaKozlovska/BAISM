package com.example.bsaism

import org.junit.Assert.assertEquals
import org.junit.Test

//Test do funkcji kalkulatora
class CalculatorTest {
    @Test
    fun add_returnsSum() {
        assertEquals(4, add(2, 2))
    }
}