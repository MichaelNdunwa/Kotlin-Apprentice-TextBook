package kotlin_apprentice.chapter_08_arrays_and_lists.challenges

/***
 * 5. The function below returns a random number between from (inclusive) and the
 * to (exclusive):
 *
 * import java.util.Random
 * val random = Random()
 * fun rand(from: Int, to: Int) : Int {
 * return random.nextInt(to - from) + from
 * }
 *
 * Use it to write a function that shuffles the elements of an array in random order. This
 * is the signature of the function:
 *
 * fun randomized(array: Array<Int>): Array<Int>
 */

import java.util.Random
val random = Random()
fun rand(from: Int, to: Int): Int {
    return random.nextInt(to - from) + from
}
fun randomized(array: Array<Int>): Array<Int> {
    val size = array.size
    var newArray = arrayOf<Int>()
    for (i in array) {
        newArray += rand(0, size)
    }
    return newArray
}

fun main() {
    val orderedArray = arrayOf(1, 2, 3, 4, 5)
    val randomArray = randomized(orderedArray)
    println(randomArray.joinToString())

    println(random.nextInt(5, 10))
}