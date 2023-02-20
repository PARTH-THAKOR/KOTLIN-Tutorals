// constructor in kotlin

fun main() {
    var k = addy("hello", 34, 6.77)
}

class addy(s: String, i: Int, d: Double) {
    init {
        println(s)
        println(i)
        println(d)
    }
}
