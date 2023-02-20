//Abstarction in kotlin

fun main() {
    val k=parth56()
    k.father()
    k.mother()
}

abstract class gurdian(){
    abstract fun father()
    abstract fun mother()
}
class parth56():gurdian(){
    override fun father() {
            println("ranvirsinh")
    }

    override fun mother() {
        println("rekha")
    }

}