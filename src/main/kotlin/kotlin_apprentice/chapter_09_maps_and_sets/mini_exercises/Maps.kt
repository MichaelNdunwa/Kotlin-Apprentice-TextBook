package kotlin_apprentice.chapter_09_maps_and_sets.mini_exercises

/*** Write a function that prints a given player's city and state. ***/

fun cityAndState(playerDetails: MutableMap<String, String>) {
    val city = playerDetails["city"]
    val state = playerDetails["state"]
    println("city = $city, state = $state")
}


val bobData = mutableMapOf(
    "name" to "Bob",
    "profession" to "CardPlayer",
    "country" to "USA",
    "state" to "CA",
    "city" to "San Francisco"
)
fun main() {
    cityAndState(bobData)
}