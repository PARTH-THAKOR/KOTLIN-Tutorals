//Error heandaling

fun main() {

    val a:Int?=null

    try {
        println(a!!)
    }
    catch (e:Exception)  {
        println("the exception is $e")
    }
    finally {
        println("hello world")
    }
}