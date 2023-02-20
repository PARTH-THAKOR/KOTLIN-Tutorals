// nested class and inner class

fun main(args: Array<String>) {
    var a = pamu.pamu2() // obj of nested class
    a.xx()

    var b = pamu().pamu23() // obj of inner class
    b.xx()
}

class pamu() {
    class pamu2() {
        fun xx() {
            println("hello1")
        }
    }
    inner class pamu23() {
        fun xx() {
            println("hello12")
        }
    }
}
