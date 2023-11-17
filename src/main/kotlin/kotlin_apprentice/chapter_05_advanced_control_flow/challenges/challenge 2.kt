package kotlin_apprentice.chapter_05_advanced_control_flow.challenges

/***
 * 2. In the while loop below, how many instances of “a” will there be in aLotOfAs?
 * Hint: aLotOfAs.count tells you how many characters are in the string aLotOfAs
 */

fun main() {
    var aLotOfAs = ""
    while (aLotOfAs.length < 10) {
        aLotOfAs += "a"
    }

    println(aLotOfAs)
    println(aLotOfAs.length)

    /*var instancesOfA = ""
    for (i in 0..aLotOfAs.count()) {
        if (aLotOfAs[i] == 'a') instancesOfA += i
    }
    println(instancesOfA.count())*/
}