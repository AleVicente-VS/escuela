data class Line(
    val startPoint: Point,
    val endPoint : Point

){
    fun print(){    //enlazado a Line, print() es una función miembro que imprime los puntos que forman la línea.
        println("punto a: ${startPoint}, punto b: ${endPoint}")
    }
}