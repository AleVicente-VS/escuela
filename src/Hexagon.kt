import kotlin.math.*

class Hexagon(
    val length: Int,
    override val originX: Int = 0,
    override val originY: Int = 0
): Shape, Drawable {
    override val name: String
        get() = Hexagon::class.simpleName.orEmpty()
    override val lines: List<Line>
        get() = generateLines()

    private fun generateLines(): List<Line> {
        val x = originX
        val y = originY
        val angles = listOf(0, 60, 120, 180, 240, 300)

        val points = angles.map { angle ->
            val rad = Math.toRadians(angle.toDouble())
            val px = x + (length * cos(rad)).roundToInt()
            val py = y + (length * sin(rad)).roundToInt()
            Point(px, py)
        }

        return points.zipWithNext().map { (a, b) -> Line(a, b) } +
                Line(points.last(), points.first())
    }

    override fun draw() {
        super.draw()
        val rows = originY + length * 2
        val columns = originX + length * 2

        for (y in 0..rows) {
            for (x in 0..columns) {
                val isOnEdge = lines.any { it.isNear(x, y) }
                print(if (isOnEdge) "*" else " ")
            }
            println()
        }
    }

}

