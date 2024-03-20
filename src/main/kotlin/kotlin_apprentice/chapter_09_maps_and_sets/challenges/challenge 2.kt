package kotlin_apprentice.chapter_09_maps_and_sets.challenges

/***
 * 2. Given a map with two-letter state codes as keys, and the full state names as
 *      values, write a function that prints all the states with names longer than eight
 *      characters. For example, for the map mapOf("NY" to "New York", "CA" to "California"),
 *      the output would be California.
 */

fun longerThanEight(states: Map<String, String>) {
    val listOfStates = mutableListOf<String>()
    for (state in states.values) {
        if (state.length > 8) {
            listOfStates.add(state)
        }
    }
    println(listOfStates.joinToString())
}

fun main() {
    val states = mapOf(
        "NY" to "New York",
        "CA" to "California"
    )
}