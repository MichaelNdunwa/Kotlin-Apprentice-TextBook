package kotlin_apprentice.chapter_05_advanced_control_flow.challenges

/**
 * 5. Print a countdown from 10 to 0 without using downTo.
 */

fun main() {
    var counter = 10
    while (counter >= 0) {
        print("$counter ")
        counter--
    }
}