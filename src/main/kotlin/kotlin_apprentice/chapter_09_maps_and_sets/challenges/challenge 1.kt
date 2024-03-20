package kotlin_apprentice.chapter_09_maps_and_sets.challenges

/***
 * 1. Which of the following are valid statements?
 *      1. val map1: Map<Int to Int> = emptyMap()  -> Invalid
 *      2. val map2 = emptyMap()                   -> Valid
 *      3. val map3: Map<Int, Int> = emptyMap()    -> Valid
 * For the next four statements, use the following map:
 *          val map4 = mapOf("One" to 1, "Two" to 2, "Three" to 3)
 *      4. map4[1]                                 -> Invalid
 *      5. map4["One"]                             -> Valid
 *      6. map4["Zero"] = 0                        -> Invalid
 *      7. map4[0] = "Zero"                        -> Invalid
 * For the next three statements, use the following map:
 *          val map5 = mutableMapOf(
 *          "NY" to "New York",
 *          "CA" to "California"
 *          )
 *      8. map5["NY"]                              -> Valid
 *      9. map5["WA"] = "Washington"               -> Valid
 *      10. map5["CA"] = null                      -> Invalid
 */

fun main() {
    val emptyMap = HashMap<Int, Int>()
    var map2 = emptyMap
}