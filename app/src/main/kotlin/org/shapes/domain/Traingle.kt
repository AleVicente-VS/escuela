package org.shapes.domain

class Traingle(
    val length: Int,
    override val originX: Int = 0,
    override val originY: Int = 0
): Shape {
    override val lines: List<Line>
        get() = generateLines()
    override val name: String = Traingle::class.simpleName.orEmpty()

    private fun generateLines(): List<Line>{
        val x = originX
        val y = originY
        return listOf(
            Line(startPoint = Point(x , y), endPoint = Point(x + length,y)),
            Line(startPoint = Point(x + length, y), endPoint = Point(x + length,y +length)),
            Line(startPoint = Point(x +length, y + length), endPoint = Point(x ,y))
        )
    }
    override fun draw() {
        super.draw()
        val base = length
        val originX = originX
        val originY = originY

        val rows = originY + base
        val columns = originX + base

        for (y in 0..rows) {
            for (x in 0..columns) {
                val withinTriangle = x >= originX && x <= originX + (y - originY) && y in originY..originY + base
                val isEdge = x == originX || y == originY + base || x == originX + (y - originY)

                print(
                    when {
                        isEdge && withinTriangle -> "*"
                        withinTriangle -> " "
                        else -> " "
                    }
                )
            }
            println()
        }
    }
}