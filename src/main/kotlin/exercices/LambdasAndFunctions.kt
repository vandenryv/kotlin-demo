package org.example.exercices

import java.util.function.BiFunction

class LambdasAndFunctions


/**
 * Fill the function using .map{} and a lambda, you should not need parenthesis
 */
fun doubleEach(numbers: List<Int>): List<Number> {
    return emptyList()
}

/**
 * Same as above but without "->", use it instead
 */
fun tripleEach(numbers: List<Int>): List<Number> {
    return emptyList()
}

/**
 * Replace Java's BiFunction by Kotlin equivalent then correct the function
 */
fun specialOperation(a: Int, b: Int, biFunction: BiFunction<Int, Int, Int>): Int {
    return biFunction.apply(a, b)
}
