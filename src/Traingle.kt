class Traingle(
    val length: Int,
    override val originX: Int = 0,
    override val originY: Int = 0
): Shape{
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
}