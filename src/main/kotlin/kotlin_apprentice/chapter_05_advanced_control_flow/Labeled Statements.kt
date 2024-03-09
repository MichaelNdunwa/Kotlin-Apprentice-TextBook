package kotlin_apprentice.chapter_05_advanced_control_flow

/***
 * Take the example of an 8 by 8 grid, where each cell holds a value of the row multiplied by the column.
 * It looks much like a multiplication table, doesn't it?
 */

fun multiplicationOf8By8Grid() {
    for (row in 0..7) {
        for (column in 0..7) {
            if ((row * column) <= 9) {
                print("${row * column}  ")
            } else {
                print("${row * column} ")
            }
        }
        println()
    }
}

fun letterI() {
    var n = 0
    for (row in 0..8) {
        for (column in 0..8) {
            n++

            /*if (n <= 9) {
                print("$n  ")
            } else {
                print("$n ")
            }*/

            when {
                n <= 27 -> print("0 ")
                n in 28..30 -> print("  ")
                n in 31..33 -> print("0 ")
                n in 34..37 -> print("  ")
                n in 38..39 -> print("  ")
                n in 40..42 -> print("0 ")
                n in 43..45 -> print("  ")
                n in 46..48 -> print("  ")
                n in 49..51 -> print("0 ")
                n in 55..81 ->print("0 ")
            }
        }
        println()
    }
}

fun sumOfOddCells() {
    var sumUpOddCells = 0
    for (row in 0..7) {
        for (column in 0..7) {
            val multiply = row * column
            if (row % 2 == 0 ) {
                print("[] ")
            } else if (multiply <= 9) {
                print("$multiply  ")
                sumUpOddCells += multiply
            } else {
                print("$multiply ")
                sumUpOddCells += multiply
            }
        }
        println()
    }
    println("Sum of all the odd cells is; $sumUpOddCells")
}

fun sumMostOfTheCells() {
    /***
     * This second example will calculate the sum of all cells, excluding those where the column is greater than or
     * to the row.
     */

    var sumAllCells = 0
    rowLoop@for (row in 0..7) {
        for (column in 0..7) {
            if (column == row) {
                println()
                continue@rowLoop
            }
            val calculate = row * column
            if (calculate <= 9) {
                print("$calculate  ")
                sumAllCells += calculate
            } else {
                print("$calculate ")
                sumAllCells += calculate
            }
        }
    }
    println("The total sum of all the cells is; $sumAllCells")
}

fun main() {
    /* multiplicationOf8By8Grid()
     println()
     println()

     for (row in 0..7) {
         for (column in 0..7) {
             if ((row * column) < 10) {
                 print("   ")
             } else {
                 print("${row * column} ")
             }
         }
         println()
     }*/

//    letterI()

//    sumOfOddCells()
    sumMostOfTheCells()
}
