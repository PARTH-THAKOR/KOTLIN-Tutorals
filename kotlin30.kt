// with(this) block

fun main(args: Array<String>) {
    var c = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    with(c) { println(this.size) }
    // but we cant change this word
}
