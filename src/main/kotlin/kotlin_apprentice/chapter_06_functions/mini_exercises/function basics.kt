package kotlin_apprentice.chapter_06_functions.mini_exercises

import kotlin.reflect.KFunction2

/***
 * Mini-exercises
 * 1. Write a function named printFullName that takes two strings called firstName
 *      and lastName. The function should print out the full name defined as firstName
 *      + " " + lastName. Use it to print out your own full name.
 */

fun printFullName(firstName: String, lastName: String) = println(firstName + " " + lastName)


/***
 * 2. Call printFullName using named arguments
 */

fun main() {
    printFullName(firstName = "Michael", lastName = "Ndunwa")
    val myName = calculateFullName("Michael", "Ndunwa")
    println(myName)

    val fullNameLength = myName.second
    print(fullNameLength)
}


/***
 * 3. Write a function named calculateFullName that returns the full name as a
 *      string. Use it to store your own full name in a constant
 */

fun calculateFullName(firstName: String, lastName: String): Pair<String, Int> {
    val fullName = "$firstName $lastName"
    return Pair(fullName, fullName.length)
}