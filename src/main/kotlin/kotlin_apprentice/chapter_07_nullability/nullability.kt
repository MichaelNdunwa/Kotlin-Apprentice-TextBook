package kotlin_apprentice.chapter_07_nullability

fun main() {
    /*** INTRODUCING NULLABLE TYPES ***/
    var initializationValue: Int? = 5
    val niV = initializationValue

    /*** CHECKING FOR NULL ***/
    var result: Int? = 30
    println(result)
    println(result?.plus(1) ?: 0)

    var studentName: String? = "Michael Ndunwa"
    var studentAge: Int? = 22

    val ageAfterBirthday = studentAge!! + 1
    println("After their next birthday, student will be $ageAfterBirthday")


    /*** SMART CASTS ***/
    var nonNullableStudent: String
    var nullableStudent: String?

    if (studentName != null) {
        nonNullableStudent = studentName
    } else {
        nullableStudent = studentName
    }

    // SAFE CALLS:
    var nameLength = studentName?.length
    println("Student's name has length $nameLength.")

    // Safe calls can be chained:
    val nameLengthPlus5 = studentName?.length?.plus(5)
    println("Student's name length plus 5 is $nameLengthPlus5.")

    // the let() function:
    studentName?.let {
        nonNullableStudent = studentName
    }

    studentName?.let {
        nameLength = studentName.length
    }


    /*** ELVIS OPERATOR ***/
    var nullableInt: Int? = 10
    var mustHaveResult = nullableInt ?: 0

    nullableInt = null
    mustHaveResult = nullableInt ?: 0
}