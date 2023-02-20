// apply and run block

fun main(args: Array<String>) {
    var c = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    c.apply { println(this.size) }.also { println("hello hello") }
    c.run { println(this.size) }.also { println("hello hello") }
}
