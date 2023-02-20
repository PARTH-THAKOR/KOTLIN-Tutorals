// Data class

fun main(args: Array<String>) {
    var c = arrayListOf<x11x1>()
    c.add(x11x1("parth", "thakor", 19))
    c.add(x11x1("partrrffh", "theaakor", 19))
    c.add(x11x1("partrerrfffh", "theaakor", 19))
    c.add(x11x1("partrferfh", "theaakor", 19))
    c.add(x11x1("partrffh", "thearakor", 19))
    c.add(x11x1("partre56rffh", "theaakor", 19))
    c.add(x11x1("partrf6fh", "thearfakor", 19))
    c.add(x11x1("partrf323fh", "theraakor", 19))
    // println(c)
    for (i in c) {
        println(i)
    }
}

data class x11x1(var name: String = "", var surname: String = "", var age: Int = 0)
