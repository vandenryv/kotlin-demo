package org.example.exercices

class ScopeFunctions

/**
 * Rewrite the function so that we can read the operation from left to right
 * use the let scope operation
 */
fun applyAThenBFunction(funA: (String) -> String, funB: (String) -> String, input: String): String {
    return funB(funA(input))
}

/**
 * Same as above, your result should have only one line
 */
fun applyAThenBFunctionOnNullable(funA: (String) -> String?, funB: (String) -> String?, input: String?): String? {
    if (input == null)
        return null
    val resultA = funA(input)
    if (resultA == null)
        return null
    return funB(resultA)

}
