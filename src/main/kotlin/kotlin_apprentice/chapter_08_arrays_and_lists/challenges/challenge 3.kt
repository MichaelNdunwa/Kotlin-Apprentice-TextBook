package kotlin_apprentice.chapter_08_arrays_and_lists.challenges

/***
 * 3. Write a function that removes all occurrences of a given integer from a list of
 * integers. This is the signature of the function:
 *
 * fun remove(item: Int, list: List<Int>): List<Int>
 */

fun remove(item: Int, list: List<Int>): List<Int> {
    var list = list
/*    list.forEach {
        if (item == it) {
            list -= it
        }
    }*/
    /*while(item in list) {
        list -= item
    }*/
    return list
}

fun main() {
    println(remove(4, listOf(4, 4, 4, 3, 4, 4, 5)).joinToString())
}