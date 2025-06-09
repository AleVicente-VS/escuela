fun main() {
    val square = Square(length = 6, originX = 6, originY = 6)
    val triangle = Traingle(length = 10, originX = 6, originY = 6)
    //val shapes: List<Shape> = listOf(square, triangle)

    val shapes: List<Drawable> = listOf(square,triangle)
    val drawerSquare = drawSquare(square)
    val drawerTriangle = drawTriangle(triangle)
    val drawers: List<Drawable> = listOf(drawerSquare, drawerTriangle)


    shapes.onEach {  //forma concisa para recorrer una lista de figuras y dibujar cada una al llamar al metodo draw()
        it.draw()    //it es una forma abreviada de referirse al elemento actual en la iteración (cada Shape).
        //drawer.draw()
        //drawerT.draw()
    }
    drawers.onEach { it.draw() }
}

