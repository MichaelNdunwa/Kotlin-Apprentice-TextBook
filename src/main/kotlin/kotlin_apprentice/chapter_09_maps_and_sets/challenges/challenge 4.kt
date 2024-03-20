package kotlin_apprentice.chapter_09_maps_and_sets.challenges

/***
 * 4. Declare a function occurrencesOfCharacters that calculates which characters
 *      occur in a string, as well as how often each of these characters occur. Return the
 *      result as a map. This is the function signature:
 *              fun occurrencesOfCharacters(text: String): Map<Char, Int>
 *      Hint: String is a collection of characters that you can iterate over with a for
 *      statement.
 */

fun occurrencesOfCharacters(text: String): Map<Char, Int> {
    val mapOfCharacters = mutableMapOf<Char, Int>()
    for (i in text) {
        val count = text.count { it == i }
        mapOfCharacters += Pair(i, count)
    }
    return mapOfCharacters
}


// Solution 2:
fun occurrencesOfCharacters2(text: String): Map<Char, Int> {
    val map = mutableMapOf<Char, Int>()
    for (c in text) {
        val count = map.getOrDefault(c, defaultValue = 0)
        map[c] = count + 1
    }
    return map
}
fun main() {
    println(occurrencesOfCharacters("I'm your huckleberry."))
    println(occurrencesOfCharacters2("I'm your huckleberry."))
}