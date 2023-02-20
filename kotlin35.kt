// seald class

fun main(args: Array<String>) {
    val bmw = car("lol")
    val bmw2 = car("lo2l")
}

sealed class ccl

class car(a: String) : ccl()

class bike(a: String, b: Double)

// for makking mulltiple object
