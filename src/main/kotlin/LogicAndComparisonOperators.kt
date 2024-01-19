fun main() {
    comp()
}

fun comp() {
    val x = 5
    val y = 5
    val a = 6
    val b = 10
    println(x == y)
    println(x < y)
    println(x <= y)
    println(x >= y)
    println(x != y)

    println(x == y && a == b) //and
    println(x == y || a == b) //or
    println(!(x == y) && a == b) //not
    println(!(x == y || a == b))
    println(!(x == y || a == b && a > y))
    println(!((x == y || a == b) && a > y))

    val simpleExpression = 3 > 4 || 4 > 3 && 4 <= 4
    println(simpleExpression)

    val bool = true
    val c = 9
    val d = 3
    val e = 9
    val hardExpression = !(c != e) && bool || e > (c+d) && (!bool || d < e)
    println(hardExpression)
}