//inheritance in kotlin

fun main() {
    var a=parth()
    println(a.name)
    println(a.standard)
    println(a.father)
    println(a.mother)
}

class parth():parentsname(){
    var name="parth"
    var standard ="8th"
}
class parth2():parentsname(){
    var name="parth2"
    var standard ="9th"
}
class parth3():parentsname(){
    var name="parth3"
    var standard ="10th"
}
open class parentsname(){
    var father="ranvir"
    var mother="rekha"
}