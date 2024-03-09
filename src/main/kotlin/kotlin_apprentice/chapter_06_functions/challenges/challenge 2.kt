package kotlin_apprentice.chapter_06_functions.challenges

// Solution 1: I think this is 'memoization' method:
fun fibonacciA(number: Int): Int {
    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, .....,
    val fibonacciSeries = mutableListOf(0, 1)
    for(f in 2..number) {
        fibonacciSeries.add(fibonacciSeries[f - 2] + fibonacciSeries[f - 1])
    }
    return fibonacciSeries[number]
}


// Solution 2: Recursion Method:
fun fibonacciB(number: Int): Int {
    // Short-circuiting:
    if (number <= 0) return 0

    // Another short-circuiting:
    if (number == 1 || number == 2) return 1

    return fibonacciB(number - 1) + fibonacciB(number - 2)

}

fun main() {
    // Checking solution 1:
    println("fibonacci(1) = ${fibonacciA(1) }")  // = 1
    println("fibonacci(2) = ${fibonacciA(2) }")  // = 1
    println("fibonacci(3) = ${fibonacciA(3) }")  // = 2
    println("fibonacci(4) = ${fibonacciA(4) }")  // = 3
    println("fibonacci(5) = ${fibonacciA(5) }")  // = 5
    println("fibonacci(6) = ${fibonacciA(6) }")  // = 8
    println("fibonacci(7) = ${fibonacciA(7) }")  // = 13
    println("fibonacci(10) = ${fibonacciA(10)}")   // = 55

    println("\n")

    // Checking solution 2:
    println("fibonacci(1) = ${fibonacciB(1) }")  // = 1
    println("fibonacci(2) = ${fibonacciB(2) }")  // = 1
    println("fibonacci(3) = ${fibonacciB(3) }")  // = 2
    println("fibonacci(4) = ${fibonacciB(4) }")  // = 3
    println("fibonacci(5) = ${fibonacciB(5) }")  // = 5
    println("fibonacci(6) = ${fibonacciB(6) }")  // = 8
    println("fibonacci(7) = ${fibonacciB(7) }")  // = 13
    println("fibonacci(10) = ${fibonacciB(10)}")   // = 55
}