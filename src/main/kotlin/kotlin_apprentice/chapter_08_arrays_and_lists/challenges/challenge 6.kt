package kotlin_apprentice.chapter_08_arrays_and_lists.challenges

/***
 * 6. Write a function that calculates the minimum and maximum value in an array of
 *      integers. Calculate these values yourself; don’t use the methods min and max.
 *      Return null if the given array is empty.
 *      This is the signature of the function:
 *          fun minMax(numbers: Array<Int>): Pair<Int, Int>?
 *      Hint: You can use the Int.MIN_VALUE and Int.MAX_VALUE constants within the function.
 */

fun minMax(numbers: Array<Int>): Pair<Int, Int>? {
    if (numbers.isEmpty()) return null

    var min = 0
    var max = 0
    for (i in numbers) {
        if (i < min) min = i else max = i
    }

    return Pair(min, max)
}

/*fun minMax(numbers: Array<Int>): Pair<Int, Int>? {
    if (numbers.isEmpty()) return null

    var min = Int.MIN_VALUE
    var max = Int.MAX_VALUE

    for (number in numbers) {
        if (number < min) {
            min = number
        }
        if (number > max) {
            max = number
        }
    }
    return Pair(min, max)
}*/
fun main() {
    val integers = arrayOf(4, -54, -300, 23, 55666, 22, 1, -2223, 33, 11, 500000)
    val minMax = minMax(integers)
    println("min = ${minMax?.first}")
    println("max = ${minMax?.second}")
}