package kotlin_apprentice.chapter_06_functions.challenges

fun fibonacci(number: Int): Int {
    // 0, 1, 1, 2, 3, 5, 8, 12, 20, 32, 52, 84, .....,
    val fibonacciSeries = mutableListOf(0, 1)
    for(f in 2..number) {
        fibonacciSeries.add(fibonacciSeries[f - 2] + fibonacciSeries[f - 1])
    }
    return fibonacciSeries[number]

}

fun main() {
    println(fibonacci(10))
}