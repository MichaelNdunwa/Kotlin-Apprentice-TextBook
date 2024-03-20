package kotlin_apprentice.chapter_09_maps_and_sets

fun main() {
    var isThisPair = "Anna" to 1990
    isThisPair

    /*** CREATING MAPS: ***/
    println("/*** CREATING MAPS: ***/")
    var checkingSomething = mapOf(
        Pair("Anna", 1990),
        Pair("Brian", 1991),
        Pair("Craig", 1992),
        Pair("Donna", 1993)
    )
    println("checkingSomething => ${checkingSomething}")

    var yearOfBirth = mapOf(
        "Anna" to 1990,
        "Brian" to 1991,
        "Craig" to 1992,
        "Donna" to 1993
    )
    println("yearOfBirth => ${yearOfBirth}")

    var namesAndScores = mutableMapOf(
        "Anna" to 2,
        "Brian" to 2,
        "Craig" to 8,
        "Donna" to 6
    )
    println("namesAndScores => ${namesAndScores}")

    namesAndScores = mutableMapOf()

    var pairs = HashMap<String, Int>()
    var emptyMap = mapOf<String, Int>()
    emptyMap = mapOf(
        "" to 1
    )
    pairs = HashMap<String, Int>(20)


    /*** Using the index operator to access values: ***/
    println("\n/*** Using the index operator to access values: ***/")
    namesAndScores = mutableMapOf(
        "Anna" to 2,
        "Brian" to 2,
        "Craig" to 8,
        "Donna" to 6
    )
    println("Anna to ${namesAndScores["Anna"]}")
    println("Greg to ${namesAndScores["Greg"]}")


    /*** Using properties and methods to access values: ***/
    println("\n/*** Using properties and methods to access values: ***/")
    println("Craig to ${namesAndScores.get("Craig")}")

    println("namesAndScores.isEmpty() => ${namesAndScores.isEmpty()}")
    println("namesAndScores.size => ${namesAndScores.size}")
    namesAndScores.remove("Donna")
    println("namesAndScores = ${namesAndScores}")
    namesAndScores.put("Donna", 6)
    println("namesAndScores = ${namesAndScores}")


    /*** Modifying mutable maps: ***/
    println("\n/*** Modifying mutable maps: ***/")
    // Adding pairs:
    val bobData = mutableMapOf(
        "name" to "Bob",
        "profession" to "CardPlayer",
        "country" to "USA"
    )
    bobData.put("state", "CA")
    bobData["city"] = "San Francisco"

    // Updating values:
    bobData["name"] = "Bobby"
    bobData["profession"] = "Mailman"

    val pair = "nickname" to "Bobby D"
    bobData += pair
    println("updated bobData = $bobData")

    // Removing pairs:
    bobData.remove("city")
    bobData.remove("state", "CA")
    println("bobData = $bobData")



    /*** Iterating through maps ***/
    println("\n/*** Iterating through maps ***/")
    for ((player, score) in namesAndScores) {
        println("$player - $score")
    }
    println()

    namesAndScores.forEach { player, score ->
        println("$player - $score.")
    }

    println()
    for (player in namesAndScores.keys) {
        print("$player ")
    }
    println()


    /*** Hashing ***/
    println("\n/*** Hashing ***/")
    println("some string.hashCode() => ${"some string".hashCode()}")
    println("1.hashCode() => ${1.hashCode()}")
    println("false.hashCode() => ${false.hashCode()}")


    /*** Creating sets ***/
    println("\n/*** Creating sets ***/")
    val names = setOf("Anna", "Brian", "Craig", "Anna", 1)
    println("names = $names")

    // creating an empty set:
    println("\n// creating an empty set:")
    val hashSet = HashSet<Int>()
    val emptySet = setOf<Int>()
    println("hashSet = $hashSet")
    println("emptySet = $emptySet")

    /*** Set from arrays: ***/
    println("\n/*** Set from arrays: ***/")
    val someArray = arrayOf(1, 2, 3, 1)
    val someSet = mutableSetOf(0, *someArray)
    println("someSet = $someSet")


    /*** Accessing elements of a set ***/
    println("\n/*** Accessing elements of a set ***/")
    println("someSet.contains(1) = ${someSet.contains(1)}")
    println("4 in someSet = ${4 in someSet}")

    for (number in someSet) {
        println(number)
    }

    /*** Adding and removing elements ***/
    println("\n/*** Adding and removing elements ***/")
    val addedFive = someSet.add(4)
    println("addedFive = $addedFive")

    val removedOne = someSet.remove(1)
    println("removedOne = $removedOne")

    println("someSet is now: $someSet")
}