data class Line(
    val startPoint: Point,
    val endPoint : Point

){
    fun print(){
        println("punto a: ${startPoint}, punto b: ${endPoint}")
    }
}