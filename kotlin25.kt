// this keyword

fun main(args: Array<String>) {
    var m = bb()
    println(m.c)
    m.ff("cccccc")
    print(m.c)
}

class bb {
    var c = "lol"
    fun ff(c: String) {
        this.c = c
    }
}
