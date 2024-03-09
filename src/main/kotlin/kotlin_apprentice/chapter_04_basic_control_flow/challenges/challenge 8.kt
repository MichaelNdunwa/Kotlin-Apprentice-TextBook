package kotlin_apprentice.chapter_04_basic_control_flow.challenges

/***
 * 8. Given a number n, calculate the n-th Fibonacci number. (Recall Fibonacci is 1, 1,
 * 2, 3, 5, 8, 13, … Start with 1 and 1 and add these values together to get the next
 * value. The next value is the sum of the previous two. So the next value in this
 * case is 8+13 = 21.)
 */

// Fibonacci Formula: Fn = Fn-1 + Fn-2, when n > 1
fun fibonacciSolutionOne(n: Int) {
    val fibonacciSequence = mutableListOf(1, 1)
    if (n > 1) {
        for (i in 2 until n) {
            fibonacciSequence.add(fibonacciSequence[i-1] + fibonacciSequence[i-2])
        }
        println("Fibonacci number $n is ${fibonacciSequence[fibonacciSequence.size - 1]}")
    } else {
        println("Can't work because $n is less than 1. Try again.")
    }

}

fun fibonacciSolutionTwo(n: Int) {
    val goal = 10
    var current = 1
    var previous = 1
    var done = 2
    while (done < goal) {
        val next = current + previous
        previous = current
        current = next
        done += 1
    }
    println("Fibonacci number $goal is $current")
}




fun main() {
    fibonacciSolutionOne(10)
    fibonacciSolutionTwo(10)

}
