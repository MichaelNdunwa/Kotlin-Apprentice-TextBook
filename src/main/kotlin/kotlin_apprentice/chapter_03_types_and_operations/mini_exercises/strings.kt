package kotlin_apprentice.chapter_03_types_and_operations.mini_exercises

fun main() {
    /**
     * 1. Create a string constant called firstName and initialize it to you first name. Also create a string constant
     *      called lastName and initialize it to your last name.
     */
    val firstName: String = "Michael"
    val lastName: String = "Ndunwa"

    /**
     * 2. Create a string  constant called fullName by adding the firstName and lastName constants together, separated
     *      by a space.
     */
    val fullName: String = "$firstName $lastName"

    /**
     * 3. Using string templates, create a string constant called myDetails that uses the fullName constant to create a
     *      string introducing yourself. For example, it could read: "Hello, my name is Joe Howard.".
     */
    val myDetails: String = "Hello my name is $fullName"
}