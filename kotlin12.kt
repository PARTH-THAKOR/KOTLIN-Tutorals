//immutable(constant) collection

fun main() {

    //list
    val a= listOf<Int>(1,1,1,2,3,3,4,5,56,6,7)
    println(a)
    println(a[0])
    println(a.size)
    println(a.indexOf(56))
    println(a.contains(56))

    //set
    val b= setOf<Int>(1,1,1,2,3,3,4,5,56,6,7)
    println(b)
    println(b.isEmpty())
    println(b.size)
    println(b.indexOf(56))
    println(b.contains(56))

    //map
    val c= mapOf<String,Int>(Pair("h",2), Pair("j",2))
    println(c)
    println(c)
    println(c.size)
    println(c.contains("h"))
    println(c.isNotEmpty())
    println(c["h"])
}