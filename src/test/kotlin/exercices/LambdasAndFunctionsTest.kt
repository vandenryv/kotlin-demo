package exercices

import org.example.exercices.doubleEach
import org.example.exercices.specialOperation
import org.example.exercices.tripleEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LambdasAndFunctionsTest {

    @Test
    fun doubleEach() {
        assertEquals(listOf(2,4,6),doubleEach(listOf(1,2,3)))
    }

    @Test
    fun tripleEach() {
        assertEquals(listOf(3,6,9),tripleEach(listOf(1,2,3)))
    }

    @Test
    fun specialOperation() {
        assertEquals(10,specialOperation(2,2){a,b -> a*3+b*2})
        assertEquals(10,specialOperation(20,5){a,b -> a+b*-2})

    }
}