fun main() {
    val square = Square(length = 5, originX = 0, originY = 0)

    println("Segmentos del cuadrado:")
    square.lines.forEachIndexed { cont, line ->
        println("Linea ${cont + 1}: (${line.startPoint.x}, ${line.startPoint.y}) " +
                "a (${line.endPoint.x}, ${line.endPoint.y})")
    }
    println("Visualización del cuadrado")
    //drawSquare(square)
    //drawTriangle(square.length)
}

fun drawSquare(cuadrado: Square) {
    val tamaño = cuadrado.length
    val columna = cuadrado.originX + tamaño
    val fila = cuadrado.originY + tamaño

    for (y in 0..fila) {
        for (x in 0..columna) {
            val borde =
                (x == cuadrado.originX || x == cuadrado.originX + tamaño) && y in cuadrado.originY..cuadrado.originY + tamaño ||
                        (y == cuadrado.originY || y == cuadrado.originY + tamaño) && x in cuadrado.originX..cuadrado.originX + tamaño

            print(if (borde) "*" else " ")
        }
        println()
    }
}

