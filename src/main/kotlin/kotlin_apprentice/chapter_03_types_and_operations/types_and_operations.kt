package kotlin_apprentice.chapter_03_types_and_operations

fun main(){
    // Type conversion:
    // The naïve way to attempt this would be like so:
    var integer: Int = 100
    var decimal: Double = 12.5
    integer = decimal.toInt()

    // Operators with mixed types:
    val hourlyRate: Double = 19.5
    val hoursWorked: Int = 10
    val totalCost: Double = hourlyRate * hoursWorked
    val total = hourlyRate + hoursWorked

    // Concatenation:
    var message = "Hello" + " my name is "
    val name = "Michael"
    message += name // "Hello my name is Michael"

    val exclamationMark: Char = '!'
    message += exclamationMark // "Hello my name is Michael!"

    // String Templates:
    message = "Hello my name is $name!" // "Hello my name is Michael!"

    val oneThird = 1.0 / 3.0
    val oneThirdLongString = "One third is $oneThird as a decimal."

    // Multi-line strings:
    val bigString = """
       |You can have a string
       |that contains multiple
       |lines
       |by
       |doing this.
    """.trimMargin()


    // Pairs
    val coordinates: Pair<Int, Int> = Pair(2, 3)
    val coordinatesInferred = Pair(2, 3)
    val coordinatesWithTo = 2 to 3
    val coordinatesDoubles = Pair(2.1, 3.5)
    val coordinatesMixed = Pair(2.1, 3)
}