package kotlin_apprentice.chapter_05_advanced_control_flow.challenges

fun main() {
    /***
     * Consider the following when expression:
     *     when {
     *         x == y && y == z -> println("x = y = z")
     *         z == 0 -> println("On the x/y plane")
     *         y == 0 -> println("On the x/z plane")
     *         x == 0 -> println("On the y/z plane")
     *         else -> println("Nothing special")
     *     }
     */


    // val (x, y, z) = Triple(1, 5, 0)  ->  On the x/y plane
    // val (x, y, z) = Triple(2, 2, 2)  ->  x = y = z
    // val (x, y, z) = Triple(3, 0, 1)  ->  On the x/z plane
    // val (x, y, z) = Triple(3, 2, 5)  ->  Nothing special
    // val (x, y, z) = Triple(0, 2, 4)  ->  Nothing special
}