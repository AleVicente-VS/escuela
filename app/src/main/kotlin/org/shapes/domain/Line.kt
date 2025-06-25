package org.shapes.domain

import kotlin.math.hypot

data class Line(
    val startPoint: Point,
    val endPoint: Point

) {
    override fun toString(): String {
        return "x1: ${startPoint}, x2: ${endPoint}"
    }
}

fun Line.isNear(x: Int, y: Int): Boolean {
    val (x1, y1) = startPoint
    val (x2, y2) = endPoint

    val dx = x2 - x1
    val dy = y2 - y1
    val lengthSquared = dx * dx + dy * dy
    if (lengthSquared == 0) return x == x1 && y == y1

    val t = ((x - x1) * dx + (y - y1) * dy).toDouble() / lengthSquared
    if (t < 0.0 || t > 1.0) return false

    val projX = x1 + t * dx
    val projY = y1 + t * dy
    val distance = hypot(x - projX, y - projY)

    return distance < 0.6
}