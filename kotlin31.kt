// .also bock

fun main(args: Array<String>) {
    var c = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    c.let { println(it.size) }.also { println("hello hello") }
    with(c) { println(this.size) }.also { println("hello hello") }
}
// .also se hum let ya with block me extra chije add  kar sakte hai
