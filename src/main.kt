
object Singleton {
    init {
        println("Singleton initialized")
    }

    var message = "Kotlin is beuty of languaga"

    fun showMessage() {
        println(message)
    }
}

class Test {
    init {
        Singleton.showMessage()
    }
}

fun main() {
    Singleton.showMessage()
    Singleton.message = "Kotlin is cool"
 val test = Test()
}