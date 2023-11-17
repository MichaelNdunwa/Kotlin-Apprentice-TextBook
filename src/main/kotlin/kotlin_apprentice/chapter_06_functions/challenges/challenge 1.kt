package kotlin_apprentice.chapter_06_functions.challenges

// CHALLENGE 1: IT'S PRIME TIME:

fun Int.prime(): Boolean {
    for(n in 2 until this) {
        if(this % n == 0) return false
    }
    return true
}

fun main() {
    println(8893.prime())
    println(isPrime(8893))
}

fun isNumberDivisible(number: Int, divisor: Int): Boolean {
    return number % divisor == 0
}

fun isPrime(number: Int): Boolean {
    if(number < 0) return false
    for(d in 2 until number) {
        if(isNumberDivisible(number, d)) return false
    }
    return true
}