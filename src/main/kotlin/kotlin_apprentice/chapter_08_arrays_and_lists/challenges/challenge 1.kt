package kotlin_apprentice.chapter_08_arrays_and_lists.challenges

// Which of the following 1 - 10 are valid statements?

fun main() {
//     val array1 = Array<Int>()  -> Invalid
//    val array2 = arrayOf()   -> Invalid
//    val array3: Array<String> = arrayOf()  -> Valid

    val array4 = arrayOf(1, 2, 3)
//    println(array4[0])  -> Valid
//    println(array4[5])  -> Invalid
//    array4[0] = 4  -> Valid

    val array5 = arrayOf(1, 2, 3)
//    array5[0] = array5[1] -> Valid
//    array5[0] = "Six"  -> Invalid
//    array5 += 6 -> Invalid(because the array5 is created with val, it will work if it was created with var)
//    for item in array5 { println(item) }  -> Invalid(because of the absence of braces ())
}
