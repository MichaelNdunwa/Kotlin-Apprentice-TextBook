package kotlin_apprentice.chapter_03_types_and_operations.mini_exercises

fun main() {
    /**
     * 1. Create a constant called age1 and set it equal to 42. Create a constant called age2 and set it equal to 21.
     *      Check using Control+Shift+P that the type for both has been inferred correctly as Int.
     */

    val age1 = 42
    val age2 = 21

    /**
     * 2. Create a constant called avg1 and set it equal to the average of age1 and age2 using the naive operation
     *      (age1 + age2) / 2. Use Control+Shift+P to check the type and check the result of avg1. Why is it wrong?
     */

    val avg1 = (age1 + age2) / 2

    /**
     * 3. Correct the mistake in the above exercise by converting age1 and age2 to type Double in the formula. Use
     *      Control+Shift+P to check the type and check the result of avg1. Why is it now correct?
     */

    val correctAvg1 = (age1 + age2) / 2.0

}