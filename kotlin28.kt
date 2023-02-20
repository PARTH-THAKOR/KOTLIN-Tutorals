// Interface in kotlin

fun main() {
    val k = parth556()
    k.father()
    k.mother()
}

interface gurdian3 {
    fun father()
    fun mother()
}

class parth556 : gurdian3 {
    override fun father() {
        println("ranvirsinh")
    }

    override fun mother() {
        println("rekha")
    }
}
