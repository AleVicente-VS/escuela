interface Shape: Drawable  {   //Shape hereda de Drawable
    val originX: Int
    val originY: Int
    val name: String
    val lines: List<Line>

    override fun draw() {    //sobrescritura del metodo de interfaz
        println(name)
        lines.onEach { line ->    //recorre las líneas que componen la figura (.onEach ejecuta un bloque de código por cada elemento de la lista
            line.print()
        }
    }
}

interface Drawable{
    fun draw()
}