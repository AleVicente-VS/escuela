fun drawTriangle(length: Int){
    for (fila in 0 until length) {
        for (columna in 0..fila) {
            print("*")
        }
        println()
    }
}