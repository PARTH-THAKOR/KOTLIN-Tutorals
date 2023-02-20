//if,else if,else

fun main() {

    //example 1
    println("enter your age")
    val a= readln().toInt()

    if (a<18){
        println("you are 18 below")
    }
    else if (a>18){
        println("you are above 18")
    }
    else{
        println("you are 18")
    }

    //example 2
    println("enter eleement")
    val x= arrayListOf<Int>(1,1,1,2,3,3,4,5,56,6,7)
    val  o= readln().toInt()
    if (x.contains(o)){
        println("hello")
    }
    else {
        println("lol")
    }
}