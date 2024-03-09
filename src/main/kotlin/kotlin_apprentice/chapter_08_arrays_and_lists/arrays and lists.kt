package kotlin_apprentice.chapter_08_arrays_and_lists

fun main(michael: Array<String>) {
    val myArray = arrayOf("Anna", "Bob", "Cindy", 1, 2)

    /*** CREATING ARRAYS ***/
    println("CREATING ARRAYS:")
    val evenNumbers = arrayOf(2, 4, 6, 8)
    evenNumbers.forEach { println(it) }
    val threeFives = Array(3, {5}) // 5, 5, 5
    val threeTwos = Array(size = 3) { 2 }
    threeTwos.forEach { println(it) }

    val vowels = arrayOf("a", "e", "i", "o", "u")

    // arrays of primitive types:
    val oddNumbers = intArrayOf(1, 3, 5, 7)
    val zeros = DoubleArray(4) // 0.0, 0.0, 0.0, 0.0
    zeros.forEach { println(it) }

    // array of primitive type: how to convert object array to primitive array:
    val otherOddNumbers = arrayOf(1, 3, 5, 7).toIntArray()



    /*** ARGUMENTS TO MAIN() ***/
    println("\nARGUMENTS TO MAIN():")
    // Iterating over an array:
    michael.forEach { println(it) }

    /*** LISTS ***/
    // Creating lists:
    val innerPlanets = listOf("Mercury", "Venus", "Earth", "Mars")
    val innerPlanetArrayList = arrayListOf("Mercury", "Venus", "Earth", "Mars")

    // Creating empty lists:
    val subscribers = listOf<String>()

    // Mutable lists:
    val outerPlanets = mutableListOf("Jupiter", "Saturn", "Uranus", "Neptune")
    val exoPlanets = mutableListOf<String>()

    /*** ACCESSING ELEMENTS ***/
    println("\nACCESSING ELEMENTS:")
    // Using properties and methods:
    val players = mutableListOf("Michael", "Bob", "Cindy", "Dan")
    print(players.isEmpty())
    if (players.size < 2) {
        println("We need at least two players!")
    } else {
        println("Let's start!")
    }
    var currentPlayer = players.first()
    println(currentPlayer)
    println(players.last())

    // minOrNull() and maxOrNull()
    val minPlayer = players.minOrNull()
    minPlayer.let {
        println("$minPlayer will start")
    }

    val names = listOf<String>()
    val minName = names.minOrNull() ?: "No name here, fvck off!!"
    println(minName)

    println(arrayOf(2, 3, 1).first())  // 2
    println(arrayOf(2, 3, 1).minOrNull())  // 1

    val maxPlayer = players.maxOrNull()
    if (maxPlayer != null) {
        println("$maxPlayer is the MAX")
    }

    /*** USING INDEXING ***/
    val firstPlayer = players[0]
    println("First player is $firstPlayer.")
    val secondPlayer = players.get(1)
    println("Second player is $secondPlayer.")

    /*** USING RANGES TO SLICE ***/
    println("\nUSING RANGES TO SLICE:")
    val upcomingPlayersSlice = players.slice(3 downTo 1)
    println(upcomingPlayersSlice.joinToString())
    players.slice(1..2).forEach { println(it) }

    /*** CHECKING FOR AN ELEMENT ***/
    println("\nCHECKING FOR AN ELEMENT:")
    fun isEliminated(player: String) = player !in player  // player not in players
    println(isEliminated("Bod"))
    println(players.slice(1..3).contains("Michael"))
    println(players.slice(1..3))


    /*** MODIFYING LISTS ***/
    println("\nMODIFYING LISTS:")
    // Appending elements:
    players.add("Michael")
    players += "Anthony"
    println(players.joinToString())

    /***
     * While arrays are of fixed-size, you can in fact use the += operator with an array that is dedicated as var.
     */
    var array = arrayOf(1, 2, 3)
    array += 4
    println(array.joinToString())  // 1, 2, 3, 4

    var list = listOf(1, 2, 3)
    for (i in 4..6) {
        list += i
    }
    println(list.joinToString())

    println("\nRemove list elements using range:")
    println(list)
    list -= (2..5)
    println(list.joinToString())

    println("\nInsert list elements using range:")
    println(list)
    list += (2..5)
    println(list.joinToString())

    // Inserting Elements:
    players.add(5, "Frank")
    println(players.joinToString())

    // Removing Elements:
    println("\nRemoving Elements:")
    val wasPlayerRemoved = players.remove("Gina")
    println("It is $wasPlayerRemoved that Gina was removed.")
    val removeMichael = players.remove("Michael")
    println("It is $removeMichael that Michael was removed.")

    // removeAt() function:
    val removedPlayer = players.removeAt(2)
    println("$removedPlayer was removed")  // ______ was removed

//    Mini-exercise:
    println("The position of Dan in the game is ${players.indexOf("Dan")}")

    /*** UPDATING ELEMENTS ***/

    // Find the position of Frank in the players list and replace the name with Franklin:
    println(players.joinToString())
    var replace = 0
    players.forEach {
        if ("Frank" == it) {
            replace = players.indexOf(it)
        }
    }
    players[replace] = "Franklin"
    println(players.joinToString())

    players[3] = "Anna"
    players.set(3, "Anna")


    /*** ITERATING THROUGH A LIST ***/
    println("\nITERATING THROUGH A LIST:")
    val scores = listOf(2, 2, 8, 6, 1, 6)

    // Using withIndex() function:
    println("\nUsing withIndex() function:")
    for ((index, player) in players.withIndex()) {
        println("${index + 1}, $player")
    }

    // Using forEachIndexed {}:
    println("\nUsing forEachIndexed {}:")
    players.forEachIndexed { index, player ->
        println("${index + 1}. $player")
    }

    fun sumOfElements(list: List<Int>): Int {
        var sum = 0
        for (number in list) {
            sum += number
        }
        return sum
    }
    println("The total score is ${sumOfElements(scores)}")

//    MINI-EXERCISE
    // Write a for loop that prints the players' names and scores.
    if (players.size == scores.size) {
        for (index in players.indices) {
            println("${players[index]}'s score is ${scores[index]}.")
        }
    } else {
        println("The score don't align with the number of players in the game.")
    }

    /***  NULLABILITY AND COLLECTION TYPES ***/
    var nullableList: List<Int>? = listOf(1, 2, 3, 4)
    nullableList = null
    var listOfNullables: List<Int?> = listOf(1, 2, null, 4)
    var nullableListOfNullables: List<Int?>? = listOf(1, 2, null, 4)
    nullableListOfNullables = null
}