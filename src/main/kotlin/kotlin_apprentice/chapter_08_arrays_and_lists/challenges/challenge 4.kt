package kotlin_apprentice.chapter_08_arrays_and_lists.challenges

/***
 * 4. Arrays and lists have a reverse() method that reverses all the elements in-place,
 * that is, within the original array or list. Write a function that does a similar thing,
 * without using reverse(), and returns a new array with the elements of the
 * original array in reverse order. This is the signature of the function:
 *
 * fun reverse(array: Array<Int>): Array<Int>
 */

fun reverse(array: Array<Int>): Array<Int> {
    var newArray = arrayOf<Int>()
    var arraySize = array.size - 1
    while (arraySize >= 0) {
        newArray += array[arraySize]
        arraySize--
    }
    return newArray
}

fun main() {
    println(reverse(arrayOf(5, 4, 3, 2, 1, 0)).joinToString())
}