package factory.factory_method.kotlin

interface Creator{
    fun factoryMethod() : Product
}

interface Product{
    fun doStuff()
}

internal class CompanionObjectCreator {
    companion object : Creator{
        override fun factoryMethod(): Product {
            return ConcreteProduct()
        }
    }
}

class ConcreteProduct : Product {
    override fun doStuff() {
        println("ConcreteProduct что-то делает")
    }

}

fun main() {
    val concreteProduct = CompanionObjectCreator.factoryMethod()
    concreteProduct.doStuff()
}