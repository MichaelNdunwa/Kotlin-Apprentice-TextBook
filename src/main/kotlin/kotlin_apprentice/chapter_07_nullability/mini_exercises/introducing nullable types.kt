package kotlin_apprentice.chapter_07_nullability.mini_exercises

// MINI EXERCISES:

/***
 * 1. Make a nullable String called myFavoriteSong. If you have a favorite song, set it
 * to a string representing that song. If you have more than one favorite song or no
 * favorite, set the nullable to null
 */

fun introducingNullableTypes() {
    // Number 1:
    var myFavoriteSong: String? = "New Boy in Town by Elmah"
    myFavoriteSong = null

    // Number 2 and 3:
//    val parsedInt = "10".toIntOrNull()
    val parsedInt = "dog".toIntOrNull()
    println(parsedInt)

    // SMART CASTS MINI EXERCISES:
    /***
     * 1. Using your myFavoriteSong variable from earlier, use a null check and smart cast
     * to check if it contains a value. If it does, print out the value. If it doesn’t, print "I
     * don’t have a favorite song."
     *
     * 2. Change myFavoriteSong to the opposite of what it is now. If it’s null, set it to a
     * string; if it’s a string, set it to null. Observe how your printed result changes.
     */

    // Number 1 and Number 2:
    myFavoriteSong = if (myFavoriteSong == null) "New Boy in Town by Elmah"  else null

    if (myFavoriteSong != null) {
        println("$myFavoriteSong")
    } else {
        println("I don't have a favorite song.")
    }

    var songLength: Int
    if (myFavoriteSong != null) {
        songLength = myFavoriteSong.length
    }
}


fun main() {
    introducingNullableTypes()
}