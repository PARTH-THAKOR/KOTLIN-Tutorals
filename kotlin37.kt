// iateinit keyword

fun main(args: Array<String>) {
    var a = ol3()
    a.t1()
    a.t2()
    a.t3()
}

class ol3() {
    lateinit var c: String
    fun t1() {
        c = "helo1"
        println(c)
    }
    fun t2() {
        c = "helo2"
        println(c)
    }
    fun t3() {
        c = "helo3"
        println(c)
    }
}
// iski madad se hume value insilise karnee ki jarurat nahi hai
