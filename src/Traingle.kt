class Traingle(
    val length: Int,
    override val originX: Int = 0,
    override val originY: Int = 0
): Shape{
    override val lines: List<Line>
        get() = generateLines()

    private fun generateLines(): List<Line>{
        return listOf()
    }
}