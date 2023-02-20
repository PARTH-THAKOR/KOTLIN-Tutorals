//polymorphism in kotlin

fun main() {
    var k:addx=addx(12)
    println(k.add1())
    println(k.subtract1())
    println(k.multi1())
}

open class parent14(){
    open fun add1():Int{
        return 0
    }
    open fun subtract1():Int{
        return 0
    }
    open fun multi1():Int{
        return 0
    }
}

class addx(var a:Int): parent14() {
    override fun add1(): Int {
        return a+a
    }

    override fun subtract1(): Int {
        return a-3
    }

    override fun multi1(): Int {
        return a*a
    }
}