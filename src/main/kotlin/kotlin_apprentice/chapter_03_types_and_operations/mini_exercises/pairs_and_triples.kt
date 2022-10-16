package kotlin_apprentice.chapter_03_types_and_operations.mini_exercises

fun main() {
    /**
     * 1. Declare a constant Triple that contains three Int values. Use this to represent a date (month, day, year).
     */
    val date = Triple(9, 28, 2022)
    // 2. Extract the values in the triple into three constants named month, day and year.
    val (month, day , year) = date
    /** 3. In one line, read the month and year values into two constants. You'll need to employ the underscore to
     *      ignore the day.
     */
    val (month1, _, year1) = date
    /** 4. Since the values inside Pairs and Triple cannot be modified, you will need to extract the values from them,
     *      make any modifications you want, and then create a new Pair or Triple. Using the values you extracted in
     *      step three, modify the month value and create a new Pair containing the modified month along with the
     *      unmodified year.
     */

}