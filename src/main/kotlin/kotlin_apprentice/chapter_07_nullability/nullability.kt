package kotlin_apprentice.chapter_07_nullability

fun main() {
    var initializationValue: Int? = 5
    val niV = initializationValue

    // CHECKING FOR NULL:
    var result: Int? = 30
    println(result)
    println(result?.plus(1) ?: 0)

    var studentName: String? = "Michael Ndunwa"
    var studentAge: Int? = 22

    val ageAfterBirthday = studentAge!! + 1
    println("After their next birthday, student will be $ageAfterBirthday")


    // SMART CASTS:
    var nonNullableStudent: String
    var nullableStudent: String?

//    if (student != null)
}