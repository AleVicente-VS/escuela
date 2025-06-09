class drawTriangle(val triangle: Traingle): Drawable{

    override fun draw() {
        val base = triangle.length
        val originX = triangle.originX
        val originY = triangle.originY

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
