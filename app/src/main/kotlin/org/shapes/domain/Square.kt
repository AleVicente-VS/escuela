package org.shapes.domain

class Square(
    val length: Int,
    override val originX: Int = 0,
    override val originY: Int = 0
): Shape, Drawable {
    override val name: String
        get() = Square::class.simpleName.orEmpty()
    override val lines: List<Line>
        get() = generateLines()

    private fun generateLines(): List<Line> {
        val x = originX
        val y = originY
        return listOf(
            Line(Point(x, y), Point(x + length, y)),
            Line(Point(x + length, y), Point(x + length, y + length)),
            Line(Point(x + length, y + length), Point(x, y + length)),
            Line(Point(x, y + length), Point(x, y)),
        )
    }

    override fun draw() {
        super.draw()
        val rows = originY + length
        val columns = originX + length

        for (y in 0..rows) {
            for (x in 0.rangeTo(columns)) {
                val edges =
                    (x == originX || x == originX + length) && y in originY..originY + length ||
                            (y == originY || y == originY + length) && x in originX..originX + length

                print(if (edges) "*" else " ")
            }
            println()
        }
    }

}

/*
Square::class   Referencia a la clase Square
.simpleName obtiene el nombre simple de la clase como String
.orEmpty() Devuelve la cadena obtenida o una cadena vacía ("") si es null

 */
