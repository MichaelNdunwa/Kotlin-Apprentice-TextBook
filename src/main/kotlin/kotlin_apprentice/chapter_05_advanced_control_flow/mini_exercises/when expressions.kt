package kotlin_apprentice.chapter_05_advanced_control_flow.mini_exercises

// MINI EXERCISES:
/***
 * 1. Write a when expression that takes an age as an integer and prints out the life
 * stage related to that age. You can make up the life stages, or use the
 * categorization as follows: 0-2 years, Infant; 3-12 years, Child; 13-19 years,
 * Teenager; 20-39, Adult; 40-60, Middle aged; 61+, Elderly.
 *
 * 2. Write a when expression that de-structures a Pair containing a string and an
 * integer. The string is a name, and the integer is an age. Use the same cases that
 * you used in the previous exercise to print out the name followed by the life stage.
 * For example, for myself it would print out "Joe is an adult.".
 */

fun lifeStage(name: String, age: Int) {
    when (age) {
        in 0..2 -> println("$name is an infant")
        in 3..12 -> println("$name is a child")
        in 13..19 -> println("$name is a teenager")
        in 20..39 -> println("$name is an adult")
        in 40..60 -> println("$name is a middle")
        in 61..Int.MAX_VALUE -> println("$name is an elderly")
        else -> println("Invalid age number.")
    }
}