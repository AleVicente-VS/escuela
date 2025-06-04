class Square(
    val length: Int,
    override val originX: Int = 0,
    override val originY: Int = 0
): Shape{
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
}

