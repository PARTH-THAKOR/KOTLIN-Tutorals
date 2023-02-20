// smart casting

fun main(args: Array<String>) {
    var k = sumx(20)
    var h = subx(20)
    var c = arrayOf(k, h, h, k)

    for (j in c) {
        if (j is sumx) {
            println("lolx")
        } else {
            println("hmmmmmm")
        }
    }
}

class sumx(var a: Int) {
    fun calc(): Int {
        return a + 2
    }
}

class subx(var a: Int) {
    fun calc(): Int {
        return a - 2
    }
}
