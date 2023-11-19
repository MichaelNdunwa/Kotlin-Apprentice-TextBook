package kotlin_apprentice.chapter_08_arrays_and_lists

fun main(michael: Array<String>) {
    val myArray = arrayOf("Anna", "Bob", "Cindy", 1, 2)

    /*** CREATING ARRAYS ***/
    val evenNumbers = arrayOf(2, 4, 6, 8)
    evenNumbers.forEach { println(it) }
    val fiveFives = Array(3, {2})
    fiveFives.forEach { println(it) }
    println(evenNumbers)
    println(fiveFives)

    val vowels = arrayOf("a", "e", "i", "o", "u")

    // arrays of primitive types:
    val oddNumbers = intArrayOf(1, 3, 5, 7)
    val zeros = DoubleArray(4)
    zeros.forEach { println(it) }

    // array of object type:
    val otherOddNumbers = arrayOf(1, 3, 5, 7).toIntArray()

    /*** ARGUMENTS TO MAIN() ***/
    // Iterating over an array:
    michael.forEach { println(it) }
}