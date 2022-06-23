package strategy.kotlin

class UncertainAnimal {
    var makeSound = fun () {
        println("Meow")
    }
}

fun main() {
    val someAnimal = UncertainAnimal()

    someAnimal.makeSound.invoke()

    someAnimal.makeSound = fun () {
        println("Woof")
    }
    someAnimal.makeSound.invoke()

    someAnimal.makeSound = fun () {
        println("Rrrr")
    }
    someAnimal.makeSound.invoke()
}