package exercices

import org.example.exercices.applyAThenBFunction
import org.example.exercices.applyAThenBFunctionOnNullable
import org.junit.jupiter.api.Test
import java.util.*

class ScopeFunctionsTest {

    @Test
    fun applyAThenBFunctionTest() {
        assert(applyAThenBFunction(::toUpperCase,::snaking,"String") == "S_T_R_I_N_G")
    }

    fun toUpperCase(input: String): String{
        return input.uppercase(Locale.FRANCE);
    }

    fun snaking(input: String): String{
        return input.map { "$it" }.joinToString("_")
    }

    @Test
    fun applyAThenBFunctionOnNullableTest() {
        assert(applyAThenBFunctionOnNullable(::toUpperCase,::snaking,"String") == "S_T_R_I_N_G")
        assert(applyAThenBFunctionOnNullable(::toUpperCase,::snaking,null) == null)
    }
}