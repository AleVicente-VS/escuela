/*class drawSquare(val square: Square) : Drawable {
    override fun draw() {
        val rows = square.originY + square.length
        val columns = square.originX + square.length

        for (y in 0..rows) {
            for (x in 0..columns) {
                val edges =
                    (x == square.originX || x == square.originX + square.length) && y in square.originY..square.originY + square.length ||
                            (y == square.originY || y == square.originY + square.length) && x in square.originX..square.originX + square.length

                print(if (edges) "*" else " ")
            }
            println()
        }
    }
}*/