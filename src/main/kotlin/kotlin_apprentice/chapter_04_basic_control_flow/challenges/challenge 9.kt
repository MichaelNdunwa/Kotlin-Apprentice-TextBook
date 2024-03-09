package kotlin_apprentice.chapter_04_basic_control_flow.challenges

/***
 * 9. Given a number n, calculate the factorial of n. (Example: 4 factorial is equal to 1 * 2 * 3 * 4.)
 */

fun nFactorial(n: Int) {
    var factorial = 1
    var count = 1

    print("$n! : ")
    while (count <= n) {
        factorial *= count

        if (count < n) {
            print("$count * ")
        } else {
            print(count)
        }

        count++
    }
    println(" = $factorial")
}

fun nFactorialSecondSolution(n: Int) {
    var factorial = 1
    var expression = "1 "
    for (i in 2 until n) {
        expression += "* $i "
        factorial *= i
    }
    expression += "* $n"
    factorial *= n
    println("$n! : $expression = $factorial")
}

fun main() {
    nFactorial(4)
    nFactorialSecondSolution(4)
}