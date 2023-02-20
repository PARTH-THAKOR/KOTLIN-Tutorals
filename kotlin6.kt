//Input in kotlin

fun main() {

    //Default String Input                ?:"" is  null string Default
    println("enter your name")
    val a= readln()?:""
    println(a)


    //Number Input for Numeric Opretions   ?:0 is null Int default
    println("enter your age")
    val b= readln().toInt()?:0
    println(b+5)
}