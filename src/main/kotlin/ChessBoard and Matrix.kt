fun printBoard() {
    var cc = 0
    for (r in 0..7) {
        for (c in 0..7) {
            if (cc <= 9) {
                print("${cc++}  ")
            } else {
                print("${cc++} ")
            }
        }
        println()
    }
}

fun chessBoardGame() {
    val chessBoard = Array(8) { CharArray(8) { ' ' } }

    // Set up the pieces on the chessboard
    chessBoard[0][0] = 'R'
    chessBoard[0][7] = 'R'
    chessBoard[7][0] = 'r'
    chessBoard[7][7] = 'r'

    chessBoard[0][1] = 'N'
    chessBoard[0][6] = 'N'
    chessBoard[7][1] = 'n'
    chessBoard[7][6] = 'n'

    chessBoard[0][2] = 'B'
    chessBoard[0][5] = 'B'
    chessBoard[7][2] = 'b'
    chessBoard[7][5] = 'b'

    chessBoard[0][3] = 'Q'
    chessBoard[7][3] = 'q'

    chessBoard[0][4] = 'K'
    chessBoard[7][4] = 'k'

    // Print the chessboard
    for (row in 0 until 8) {
        for (col in 0 until 8) {
            print("[${chessBoard[row][col]}] ")
        }
        println()
    }

}

fun main() {
    for (row in 0 until 8) {
        for (col in 0 until 8) {
            val value = row * 8 + col
            print("${value.toString().padStart(2, ' ')} ")
        }
        println()
    }
}

