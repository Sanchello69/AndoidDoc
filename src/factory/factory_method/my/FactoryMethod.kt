package factory.factory_method.my

interface Creator{
    fun factoryMethod() : Product
}

interface Product{
    fun doStuff()
}

internal class ConcreteCreator : Creator {
    override fun factoryMethod(): Product {
        return ConcreteProduct()
    }
}

class ConcreteProduct : Product {
    override fun doStuff() {
        println("ConcreteProduct что-то делает")
    }

}

fun main() {
    val creator = ConcreteCreator()
    val concreteProduct = creator.factoryMethod()
    concreteProduct.doStuff()
}

