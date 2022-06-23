package decorator.my

//абстрактный класс компонента (можно интерфейс) - Beverage(напиток)
abstract class Beverage{

    abstract fun getDescription() : String
    abstract fun cost() : Double

}

//абстрактный класс для декораторов - CondimentDecorator(дополнения)
//наследование применяется для соглосования типов, а не для обеспечения поведения
abstract class CondimentDecorator : Beverage() {

    abstract override fun getDescription() : String

}

//конкретные реализации компонентов - напитков
class Espresso : Beverage(){

    override fun getDescription(): String {
        return "Espresso"
    }

    override fun cost(): Double {
        return 1.99
    }

}

class HouseBlend : Beverage(){

    override fun getDescription(): String {
        return "House Blend Coffee"
    }

    override fun cost(): Double {
        return .89
    }

}

class DarkRoast : Beverage(){

    override fun getDescription(): String {
        return "Dark Roast Coffee"
    }

    override fun cost(): Double {
        return .99
    }

}

//конкретные реализации декораторов - дополнений
class Mocha(private val beverage: Beverage) : CondimentDecorator(){

    override fun getDescription(): String {
        return beverage.getDescription() + ", Mocha"
    }

    override fun cost(): Double {
        return beverage.cost() + .20
    }

}

class Soy(private val beverage: Beverage) : CondimentDecorator(){

    override fun getDescription(): String {
        return beverage.getDescription() + ", Soy"
    }

    override fun cost(): Double {
        return beverage.cost() + .15
    }

}

class Whip(private val beverage: Beverage) : CondimentDecorator(){
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


