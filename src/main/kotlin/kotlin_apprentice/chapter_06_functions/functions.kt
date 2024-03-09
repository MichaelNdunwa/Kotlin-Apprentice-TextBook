package kotlin_apprentice.chapter_06_functions

fun main() {
    /*******************
     * FUNCTION BASICS *
     *******************/
    fun printMyName() = println("My name is Joe Howard.")

    // FUNCTION PARAMETERS:
    fun printMultipleOfFive(value: Int) = println("$value * 5 = ${value * 5}")

    fun printMultipleOf(multiplier: Int, andValue: Int) = println("$multiplier * $andValue = ${multiplier * andValue}")

    fun multiply(number: Int, multiplier: Int) = number * multiplier

    fun multiplyAndDivide(number: Int, factor: Int) = Pair((number * factor), (number / factor))
    val (product, quotient) = multiplyAndDivide(4, 2)

    fun multiplyInferred(number: Int, multiplier: Int) = number * multiplier

    // PARAMETERS AS VALUES:
    fun incrementAndPrint(value: Int): Int {
        val newValue = value + 1
        println(newValue)
        return newValue
    }

    fun getValue(value: Int) = value + 1
    fun getValue(value: String) = "The value is $value"

    // FUNCTIONS AS VARIABLES:
    fun add(a:Int, b: Int) = a + b
    val function = ::add
//    println(function(4, 3))

    // ASSIGNING FUNCTION TO FUNCTION:
    fun printResult(function: (Int, Int) -> Int, a: Int, b: Int, y: Int) {
        val result = function(a, b)
        print(result)
    }
    printResult(::add, 4, 2, 3)


    /*************************
     * The land of no return *
     *************************/

    fun infiniteLoop(): Nothing {
        while (true) {

        }
    }
}