package kotlin_apprentice.chapter_07_nullability

fun main() {
    /******************************
     * INTRODUCING NULLABLE TYPES *
     ******************************/
    var initializationValue: Int? = 5
    val niV = initializationValue

    var errorCode: Int?
    errorCode = 100
    errorCode = null


    /*********************
     * CHECKING FOR NULL *
     * *******************/
    println("\nCHECKING FOR NULL:")
    var result: Int? = 30
    println(result)
//    println(result!! +  1)
    println(result?.plus(1) ?: 0)


    /********************************
     * Not-null assertion operation *
     ********************************/
    println("\nNot-null assertion operation:")
    var studentName: String? = "Michael Ndunwa"
    var studentAge: Int? = 22

    val ageAfterBirthday = studentAge!! + 1
    println("After their next birthday, student will be $ageAfterBirthday")


    /***************
     * SMART CASTS *
     ***************/
    println("\nSMART CASTS:")
    var nonNullableStudent: String
    var nullableStudent: String?

    if (studentName != null) {
        nonNullableStudent = studentName
    } else {
        nullableStudent = studentName
    }

    /***************
     * SAFE CALLS: *
     ***************/
    println("\nSAFE CALLS:")
    var nameLength = studentName?.length
    println("Student's name has length $nameLength.")


    // Safe calls can be chained:
    val nameLengthPlus5 = studentName?.length?.plus(5)
    println("Student's name length plus 5 is $nameLengthPlus5.")

    val nameLengthPlus6 = studentName?.let { it.length.plus(6) }
    println("Student's name length plus 6 is $nameLengthPlus6")

    var nameLengthPlus7: Int
    studentName?.let { nameLengthPlus7 = it.length }

    /***********************
     * The let() function: *
     ***********************/
    println("\nThe let() function:")
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