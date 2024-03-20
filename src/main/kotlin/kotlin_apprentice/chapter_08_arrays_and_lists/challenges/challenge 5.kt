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
fun randomized(array: Array<Int>): MutableList<Int> {
    var size = array.size
    var newArray = arrayOf<Int>()
    val list = mutableListOf<Int>()
    for (i in 0..size) {
        newArray += rand(0, array.size)
        val n = rand(0, array.size)
        if (n !in list) {
            list.add(n)
        } else {
            size++
        }
    }
    return list
}

fun randomized2(array: Array<Int>): Array<Int> {
    val newArray = Array(array.size) { 0 }
    val usedIndices = mutableListOf<Int>()

    for (i in array.indices) {
        var randomIndex = 0
        while (true) {
            randomIndex = rand(0, array.size)
            if (randomIndex !in usedIndices) {
                usedIndices.add(randomIndex)
                break
            }
        }
        newArray[i] = array[randomIndex]
    }
    return newArray
}

fun randomized3(array: Array<Int>): MutableList<Int> {
    val newArray = Array(array.size) { 0 }
    val usedIndices = mutableListOf<Int>()

    for (i in array.indices) {
        var randomIndex = 0
        while (true) {
            randomIndex = rand(0, array.size)
            if (randomIndex !in usedIndices) {
                usedIndices.add(randomIndex)
                break
            }
        }
        newArray[i] = array[randomIndex]
    }
    return usedIndices
}

fun main() {
    /*val orderedArray = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    val randomArray = randomized(orderedArray)
    println(randomArray.joinToString())*/

    val orderedList = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    val randomList = randomized(orderedList)
    println(randomList.joinToString())

    println()

    val arrayOrdered = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    val arrayRandomized = randomized2(arrayOrdered)
    println(arrayRandomized.joinToString())
    val arrayRandomized3 = randomized3(arrayOrdered)
    println(arrayRandomized3.joinToString())
}