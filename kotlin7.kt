//Nullability

fun main() {
    var v:String?="parth"     //this shows not null string
    v=null
    println(v?.length)
}

//means value null hogi to app crash nahi hogi wo null return karegi