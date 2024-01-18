package kotlin_apprentice.chapter_02_expressions_variables_constants

import kotlin.math.*



object ArithmeticOperations {

    fun simpleArithmeticOperations() {
        println("2 + 4 = ${2 + 4}")
        println("16 - 2 = ${16 - 2}")
        println("2 * 4 = ${2 * 4}")
        println("24 / 3 = ${24 / 3}")
    }

    fun roundOff() {
        println("%.8f".format(28.0 % 10.0))
    }

    fun shiftOperations() {
        println("1 shl 3 = ${1 shl 3}")
        println("32 shr 2 = ${32 shr 2}")
    }

    fun mathFunctions() {
        println(sin(45 * PI / 180))
        println(cos(135 * PI / 180))
        println(sqrt(2.0))
        println(max(5, 10))
        println(max(-5, -10))
    }

}

object Singleton {
    init {
        println("Singleton created.")
    }
}

fun main() {
//    val arithmeticOperations = ArithmeticOperations()
//    arithmeticOperations.simpleArithmeticOperations()
//    arithmeticOperations.roundOff()
//    ArithmeticOperations.shiftOperations()
//    ArithmeticOperations.mathFunctions()
//    ArithmeticOperations.mathFunctions()

    Singleton
    Singleton
}
