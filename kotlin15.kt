//Loops

fun main() {

    //while loop
    var i=0
    while (i<10) {
        println(i)
        i++
    }


    //do while loop
    var k=0
    do {
        println(k)
        k++
    }while (k<15)


    //for loop
    for (o in 0..15){
        println(o)
    }


    //break
    for (h in 0..23){
        println(h)
        if (h==5){
            break
        }
    }


    //continue
    for (p in 0..12){
        if (p==5){
            continue
        }
        println(p)
    }


    //for each loop
    val b= setOf<Int>(1,1,1,2,3,3,4,5,56,6,7)
    for (g in b){
        println(g)
    }


    //jumping for loop
    for (f in 0..40 ){
        println(f)
    }


    //reverce  for looop
    for (t  in 24 downTo 0){
        println(t)
    }
}