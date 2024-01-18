package kotlin_apprentice.chapter_02_expressions_variables_constants.challenges

/**
 * Suppose the squares on a chessboard are numbered left to right, top to bottom, with 0 being the top-left square and
 * 63 being the bottom-right square. Rows are numbered top to bottom, 0 to 7. Columns are numbered left to right, 0 to 7.
 * Declare a constant position and assign it a value between 0 and 63. Calculate the corresponding row and column numbers
 * and store the results in constants named row and column.
 */

fun main() {
    // l to r, t to b,  tl = 0 & br = 63
    // rows are numbered tb == 0 to 7
    // columns are numbered lr == 0 to 7
    val position = 4
    val row = 1
    val column = 5


    // I don't know how to solve this question yet, but i will till figure it out.
    // I have
    findPosition(63)
}

fun findPosition(position: Int) {
//    val position = position
    var row = -2; var column = -2

    for (r in 0 until 8) {
        for (c in 0 until 8) {
            if (r * 8 + c == position) {
                row = r
                column = c
                break
            }
        }
        if (row != -2) {
            break
        }
    }

    if (row != -2 && column != -2) {
        println("$position is on Row: $row and Column: $column.")
    } else {
        println("Invalid position: $position")
    }
}