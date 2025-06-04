interface Shape: Drawable  {
    val originX: Int
    val originY: Int

    val lines: List<Line>
    override fun draw() {
        lines.onEach { line ->
            line.print()
        }
    }
}

interface Drawable{
    fun draw()
}