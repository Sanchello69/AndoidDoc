package Strategy.My

class Context(private val strategy1: Strategy1, private val strategy2: Strategy2) {
    fun useStrategy1() = strategy1.use()
    fun useStrategy2() = strategy2.use()
}

interface Strategy1 {
    fun use()
}

class Strategy1A : Strategy1 {
    override fun use() {
        println("using strategy 1A")
    }
}

class Strategy1B : Strategy1 {
    override fun use() {
        println("using strategy 1B")
    }
}

interface Strategy2 {
    fun use()
}

class Strategy2A : Strategy2 {
    override fun use() {
        println("using strategy 2A")
    }
}

class Strategy2B : Strategy2 {
    override fun use() {
        println("using strategy 2B")
    }
}

fun main() {
    val context = Context(
        Strategy1A(),
        Strategy2B()
    )
    context.useStrategy1()
    context.useStrategy2()
}