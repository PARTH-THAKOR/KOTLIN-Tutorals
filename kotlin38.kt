// type cheaking

fun main(args: Array<String>) {
    var a = ol23()
    a.t1()
    a.t2()
    a.t3()
    println(a is ol23) // type  cheaking
}

class ol23() {
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
// ye cheak  karta hai  ki var class ka hi object hai ya nahi
