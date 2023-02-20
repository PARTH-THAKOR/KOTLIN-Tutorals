// let(it) block in kotlin

fun main(args: Array<String>) {
    var c = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    c.let { println(it.size) }
    c.let { xx -> println(xx.size) }
    // we change it word
}
