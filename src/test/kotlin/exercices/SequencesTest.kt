package exercices

import org.junit.jupiter.api.Test

class SequencesTest {
    @Test
    fun factorial(){
        val list = org.example.exercices.factorial.take(4).toList()
        assert(list == listOf(1,2,6,24))
    }
}
