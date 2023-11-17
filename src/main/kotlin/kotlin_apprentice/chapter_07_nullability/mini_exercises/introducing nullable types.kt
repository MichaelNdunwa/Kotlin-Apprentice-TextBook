package kotlin_apprentice.chapter_07_nullability.mini_exercises

// MINI EXERCISES:

/***
 * 1. Make a nullable String called myFavoriteSong. If you have a favorite song, set it
 * to a string representing that song. If you have more than one favorite song or no
 * favorite, set the nullable to null
 */

fun main() {
    var myFavoriteSong: String? = "New Boy in Town by Elmah"
    myFavoriteSong = null

    // Number 2:
    val parsedInt = "dog".toIntOrNull()
    println(parsedInt)
}