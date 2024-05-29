package org.example

import java.util.*

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    printSomething("Something Something")
    printSomething(null)
    concatLists(listOf("Apple","Banana"), listOf("Citrus","Lemon"), listOf())
}

fun printSomething(input : String?){
    println("This will always print : $input")
    input?.let { println("This will only print when input in not null : $it") }
}

fun <T> concatLists(vararg lists: Collection<T>):List<T>{
    return mutableListOf<T>().apply {
        lists.forEach {
            addAll(it)
        }
    }
}