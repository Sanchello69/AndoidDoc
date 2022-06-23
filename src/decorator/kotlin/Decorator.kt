package decorator.kotlin

interface Beverage{

    fun getDescription() : String
    fun cost() : Double

}

abstract class CondimentDecorator(protected val beverage: Beverage) : Beverage by beverage

//конкретные реализации компонентов - напитков
class Espresso : Beverage{

    override fun getDescription(): String {
        return "Espresso"
    }

    override fun cost(): Double {
        return 1.99
    }

}

class HouseBlend : Beverage{

    override fun getDescription(): String {
        return "House Blend Coffee"
    }

    override fun cost(): Double {
        return .89
    }

}

class DarkRoast : Beverage{

    override fun getDescription(): String {
        return "Dark Roast Coffee"
    }

    override fun cost(): Double {
        return .99
    }

}

//конкретные реализации декораторов - дополнений
class Mocha(beverage: Beverage) : CondimentDecorator(beverage){

    override fun getDescription(): String {
        return super.getDescription() + ", Mocha"
    }

    override fun cost(): Double {
        return super.cost() + .20
    }

}

class Soy(beverage: Beverage) : CondimentDecorator(beverage){

    override fun getDescription(): String {
        return beverage.getDescription() + ", Soy"
    }

    override fun cost(): Double {
        return beverage.cost() + .15
    }

}

class Whip(beverage: Beverage) : CondimentDecorator(beverage){
    override fun getDescription(): String {
        return beverage.getDescription() + ", Whip"
    }

    override fun cost(): Double {
        return beverage.cost() + .10
    }

}

fun main() {

    val beverage1 : Beverage = Espresso()
    println("${beverage1.getDescription()} ${beverage1.cost()}")

    var beverage2 : Beverage = DarkRoast()
    beverage2  = Mocha(beverage2)
    beverage2 = Mocha(beverage2)
    beverage2 = Whip(beverage2)
    println("${beverage2.getDescription()} ${beverage2.cost()}")

    var beverage3 : Beverage = HouseBlend()
    beverage3 = Soy(beverage3)
    println("${beverage3.getDescription()} ${beverage3.cost()}")
}