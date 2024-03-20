package kotlin_apprentice.chapter_09_maps_and_sets.challenges

/***
 * 3. Write a function that combines two maps into one. If a certain key appears in
 *      both maps, ignore the pair from the first maps. This is the function’s signature:
 *          fun mergeMaps(
 *          map1: Map<String, String>,
 *          map2: Map<String, String>
 *          ): Map<String, String>
 */

fun mergeMaps(
    map1: Map<String, String>,
    map2: Map<String, String>
): Map<String, String> {
    val mergedMap = HashMap<String, String>()

    map1.forEach { (key, value) ->
        mergedMap[key] = value
    }

    map2.forEach { (key, value) ->
        mergedMap[key] = value
    }

    return mergedMap
}

// A better solution:
fun mergeMaps2(
    map1: Map<String, String>,
    map2: Map<String, String>
): Map<String, String> {
    val mergedMap = HashMap<String, String>()

    mergedMap.putAll(map1)
    mergedMap.putAll(map2)

    return mergedMap
}

fun main() {
    val firstMap = mapOf("1" to "2", "2" to "2")
    val secondMap = mapOf("1" to "1", "3" to "3")
    val mergeMaps = mergeMaps(firstMap, secondMap)
    println(mergeMaps)
}