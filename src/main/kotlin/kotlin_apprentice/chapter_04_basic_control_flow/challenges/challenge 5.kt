package kotlin_apprentice.chapter_04_basic_control_flow.challenges

/***
 * 5. Given a month (represented with a string in all lowercase) and the current year
 * (represented with an Int), calculate the number of days in the month. Remember
 * that because of leap years, “february” has 29 days when the year is a multiple of 4
 * but not a multiple of 100. February also has 29 days when the year is a multiple
 * of 400.
 */


class Challenge5(private val year: Int) {
    fun daysOfMonth(month: String) {
        when(month.lowercase()) {
            "september","april", "may", "june", "november" -> println("$month has 30 days." )
            "january", "march", "july", "august", "october", "december" -> println("$month has 31 days.")
            "february" -> println("$month has ${february()} days.")
            else -> println("$month is not a valid month.")
        }
    }

    private fun february(): Int {
        return if (year % 4 == 0 && year % 100 != 0) {
            29
        } else if (year % 400 == 0) {
            29
        } else {
            28
        }
    }
}

fun main() {
    Challenge5(2023).daysOfMonth("february")
}
