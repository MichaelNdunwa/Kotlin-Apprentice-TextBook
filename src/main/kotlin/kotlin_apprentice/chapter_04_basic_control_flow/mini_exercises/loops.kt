package kotlin_apprentice.chapter_04_basic_control_flow.mini_exercises

import java.util.*


fun main() {
    /**
     * 1. Create  a variable named counter and set it equal to 0. Create a while loop with the condition counter < 10
     *      which prints out counter is X (where X is replaced with counter value) and then increments counter by 1.
     */

//    var counter = 0
//    while (counter < 10) {
//        println("counter is ${counter++}")
//    }

    /**
     * 2. Create a variable named counter and set it equal to 0. Create another variable named roll and set it equal to
     *      0. Create a do-while loop.
     *      Inside the loop set roll equal to Random().nextInt(6) which means to pick a random number between 0 and 5.
     *      Then increment counter by 1.
     *      Finally, print After X rolls, roll is Y where X is the value of counter and Y is the value of roll. Set the
     *      loop condition such that the loop finishes when the first 0 is rolled.
     */

    var counter = 0
    var roll = 0
    do {
        roll = Random().nextInt(6)
        counter++
        println("After $counter rolls, roll is $roll.")
    } while (roll != 0)
}