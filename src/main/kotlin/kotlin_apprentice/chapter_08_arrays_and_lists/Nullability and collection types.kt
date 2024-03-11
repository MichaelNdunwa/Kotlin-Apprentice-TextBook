package kotlin_apprentice.chapter_08_arrays_and_lists

fun main() {
    println("\nNullability and collection types:")
    // A nullable list can be created as follows:
    var nullableList: List<Int>? = listOf(1, 2, 3, 4)
    nullableList = null

    // A list with elements that are nullable:
    var listOfNullables: List<Int?> = listOf(1, 2, null, 4)

    // A nullable list with a nullable elements:
    var nullableListOfNullables: List<Int?>? = listOf(1, 2, null, 4)
    nullableListOfNullables = null

    val array1 = Array<Int>(5, {4})
}