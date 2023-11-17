package kotlin_apprentice.chapter_05_advanced_control_flow

fun main() {
    // RANGES:
    // closed range:
    val closedRange = 0.5

    // half-open range;
    val halfOpenRange = 0 until 5

    // decreasing range:
    val decreasingRange = 5 downTo 0


    // FOR LOOPS:
    val count = 10
    var sum = 0
    for (i in 1..count) {
        sum += i
    }

    // repeat loops:
    sum = 1
    var lastSum = 0
    repeat(10) {
        val temp = sum
        sum += lastSum
        lastSum = temp
    }

    // steps in loops:
    sum = 0
    for (i in 1..count step 2) {
        sum += i
    }

    sum = 0
    for (i in count downTo 1 step 2) {
        sum += i
    }

    /***
     * Let's say you wanted to calculate the sum of all cells but exclude all even rows, as shown:
     * Using a for loop, you can achieve this as follows:
     */
    sum = 0
    for (row in 0 until 8) {
        if (row % 2 == 0) {
            continue
        }
        for (column in 0 until 8) {
            sum += row * column
        }
    }

    sum = 0
    rowLoop@ for (row in 0 until 8) {
        columnLoop@ for (column in 0 until 8) {
            if (row == column) {
                continue@rowLoop
            }
            sum += row * column
        }
    }


    // RETURNING VALUES:
    val number = 10
    val numberName = when(number) {
        2 -> "two"
        4 -> "four"
        6 -> "six"
        8 -> "eight"
        10 -> "ten"
        else -> {
            println("Unknown number")
            "Unknown"
        }
    }
    println(numberName)

    // LABELED STATEMENTS:
    // continue statement:
    var cell: Int
    for (row in 0..7) {
        for (column in 0..7) {
            cell = row
            cell *= column
            if (cell <= 9) print("$cell  ")
            else print("$cell ")
        }
        println()
    }

    printNumberOfRow()
   /* var counter = 0
    while (0 < counter) {
        println("I'm Michael")
        counter--
    }*/

//    val number = 10
    when (number) {
        0 -> println("Zero")
        else -> println("Non-zero")
    }

    val string = "Dog"
    when (string) {
        "Cat", "Dog" -> println("Animal is a house pet.")
        else -> println("Animal is not a house pet.")
    }

    // ADVANCED WHEN EXPRESSIONS:
    val hourOfDay = 12
    val timeOfDay = when(hourOfDay) {
        in 0..5 -> "Early morning"
        in 6..11 -> "Morning"
        in 12..16 -> "Afternoon"
        in 17..19 -> "'Evening"
        in 20..23 -> "Late evening"
        else -> "INVALID HOUR!"
    }
    println(timeOfDay)

    when {
        number % 2 == 0 -> println("Even")
        else -> println("Odd")
    }

    val (x, y, z) = Triple(3, 2, 5)
    when {
        x == 0 && y == 0 && z == 0 -> println("Origin")
        y == 0 && z == 0 -> println("On the x-axis at x = $x")
        x == 0 && z == 0 -> println("On the y-axis at y = $y")
        x == 0 && y == 0 -> println("On the z-axis at z = $z")
        else -> println("In space at x = $x, y = $y, z = $z")
    }
    when {
        x == y -> println("Along the y = x line.")
        y == x * x -> println("Along the y = x^2 line.")
    }
}

fun printOnlyEvenRow() {
    println("\nOnly Even Row Table:")
    var cell: Int
    for(row in 0..7) {
        for(column in 0..7) {
            cell = row
            cell *= column
            if (row % 2 == 0) {
                print("[] ")
            } else {
                if (cell <= 9) print("$cell  ")
                else print("$cell ")
            }
        }
        println()
    }
}

fun printNumberOfRow() {
    println("\nNumbers Of Row:")
    var cell: Int
    for (row in 0..7) {
        var checker = row
        for (column in 0..7) {
            cell = row
            if (checker > 0){
                cell *= column
                if (cell <= 9) print("$cell  ")
                else print("$cell ")
            } else {
                break
            }
            checker--
        }
        println("")
    }
}

