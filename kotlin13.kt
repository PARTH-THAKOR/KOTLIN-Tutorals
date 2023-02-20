//Mutable collection

fun main() {

    //mutable list
    val a= mutableListOf<Int>(1,1,1,2,3,3,4,5,56,6,7)
    val k= mutableListOf<Int>(1,1,1,2,3,3,4,5,56,6,7)
    println(a)
    println(a[0])
    println(a.size)
    println(a.indexOf(56))
    println(a.contains(56))
    a.add(7)
    a.remove(7)
    println(a)
    a.addAll(k)
    println(a)

    //mutable set
    val b= mutableSetOf<Int>(1,1,1,2,3,3,4,5,56,6,7)
    val m= mutableSetOf<Int>(1,1,1,2,3,3,4,5,56,6,7)
    println(b)
    println(b.isEmpty())
    println(b.size)
    println(b.indexOf(56))
    println(b.contains(56))
    a.add(7)
    a.remove(7)
    println(b)
    a.addAll(m)
    println(b)

    //mutable map
    val c= mutableMapOf<String,Int>(Pair("h",2), Pair("j",2))
    println(c)
    println(c)
    println(c.size)
    println(c.contains("h"))
    println(c.isNotEmpty())
    println(c["h"])
    c.set("hhr",7)
    println(c)
    c.remove("hhr")
    println(c)

    //arraylist
    val x= arrayListOf<Int>(1,1,1,2,3,3,4,5,56,6,7)
    val y= arrayListOf<Int>(1,1,1,2,3,3,4,5,56,6,7)
    x.add(5)
    x.remove(4)
    x[5]
    x.size
    x.addAll(y)
    println(x)

}