package kotlin_apprentice.chapter_02_expressions_variables_constants.challenges

/***
 * 7. Suppose the squares on a chessboard are numbered left to right, top to bottom,
 * with 0 being the top-left square and 63 being the bottom-right square. Rows are
 * numbered top to bottom, 0 to 7. Columns are numbered left to right, 0 to 7.
 * Declare a constant position and assign it a value between 0 and 63. Calculate
 * the corresponding row and column numbers and store the results in constants
 * named row and column.
 */

// left to right,
// top to bottom,
// top-left = tl = 0,
// bottom-right = br = 63
// rows are numbered top to bottom 0 to 7,
// columns are numbered left to right 0 to 7.

object Chessboard {

    fun findRowAndColumn(position: Int): String {
        var item = 0
        for (row in 0..7) {
            for (column in 0..7) {
                if (item == position) {
                    return "$position is on Row: $row and Column: $column."
                }
                item++
            }
        }
        return "$position is not in between 0 to 63."
    }

    fun printChessboardFormat() {
        var item = 0
        for (row in 0..7) {
            for (column in 0..7) {
                if (item <= 9) {
                    print("$item  ")
                } else {
                    print("$item ")
                }
                item++
            }
            println("")
        }
    }

}

fun main() {
    println(Chessboard.findRowAndColumn(65))

    val position = 65
    val row = position / 8
    val column = position % 8
    println("$row, $column")

//     Chessboard.printChessboardFormat()
}