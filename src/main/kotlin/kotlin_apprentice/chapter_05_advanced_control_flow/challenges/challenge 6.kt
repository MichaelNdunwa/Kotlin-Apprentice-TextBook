package kotlin_apprentice.chapter_05_advanced_control_flow.challenges

/**
 * 6. Print 0.0, 0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8. 0.9, 1.0.
 */

fun main() {
    var counter = 0.0
    while (counter <= 1.0) {
        if (counter < 0.9) {
            print("${"%.1f".format(counter)}, ")
        } else {
            print("%.1f".format(counter) + ".")
        }
        counter += 0.1
    }
}