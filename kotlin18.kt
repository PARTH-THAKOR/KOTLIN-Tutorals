//Class and object in kotlin


fun main() {
    var c=sum()
    println(c.add(3,6))
    println(c.subtract(3,6))
    println(c.multiply(3,6))
    println(c.division(3.0,6.0))
}
class sum(){
    fun add(a:Int, b:Int):Int{
        return a+b
    }
    fun subtract(a:Int, b:Int):Int{
        return a-b
    }
    fun multiply(a:Int, b:Int):Int{
        return a*b
    }
    fun division(a:Double, b:Double):Double{
        return a/b
    }


}