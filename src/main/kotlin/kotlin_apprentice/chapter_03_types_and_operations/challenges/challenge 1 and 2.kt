package kotlin_apprentice.chapter_03_types_and_operations.challenges

// Create a constant called coordinates and assign a pair containing two and three to it.

fun main() {
    val coordinates = Pair(2, 3)
    var (row, column) = coordinates

    println(kotlin.math.PI - kotlin.math.PI.toFloat())


    val date = Triple(15, 8, 2015)
    val day = date.first

    // What's wrong with the following code?
    var name = "Michael"
    name += " Ndunwa"

    // 6. What is the type of the  constant named value?
    val triple = Triple(100, 1.5, 10)
    val value = triple.second

    // 8. What is the value of the constant named summary?
    val number = 10
    val multiplier = 5
    val summary = "$number multiplied by $multiplier equals ${number * multiplier}"
}