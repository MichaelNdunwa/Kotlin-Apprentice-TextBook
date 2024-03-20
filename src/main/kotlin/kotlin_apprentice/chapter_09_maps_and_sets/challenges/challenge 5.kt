package kotlin_apprentice.chapter_09_maps_and_sets.challenges

/***
 * 5. Write a function that returns true if all of the values of a map are unique. Use a
 *      set to test uniqueness. This is the function signature:
 *          fun isInvertible(map: Map<String, Int>): Boolean
 */

fun isInvertible(map: Map<String, Int>): Boolean {
    val uniqueValues = HashSet<Int>()
    for (v in map.values) {
        if (v !in uniqueValues) {
            uniqueValues.add(v)
        } else {
            return false
        }
    }
    return true
}

fun main() {
    println(isInvertible(mapOf("1" to 1, "2" to 2, "2" to 2, "3" to 3))) // true
    println(isInvertible(mapOf("1" to 3, "2" to 2, "2" to 2, "3" to 3))) // false
}