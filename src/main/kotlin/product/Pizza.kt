package product

import Cheese
import Clam
import Dough
import Sauce
import Veggie

abstract class Pizza {

    var name: String = ""
    lateinit var dough: Dough
    lateinit var sauce: Sauce
    lateinit var veggies: List<Veggie>
    lateinit var cheese: Cheese
    lateinit var clams: Clam

    abstract fun prepare() // 把prepare 宣告成抽象, 原料要改成來自於工廠

    fun bake() = println("Bake for 25 minutes")

    fun cut() = println("Cutting the pizza")

    fun box() = println("Place pizza into box")

}

//abstract class Pizza {
//
//    var name: String = ""
//    lateinit var dough: Dough
//    lateinit var sauce: Sauce
//    lateinit var veggies: List<Veggie>
//    lateinit var cheese: Cheese
//    lateinit var clams: Clam
//
//    val toppings = listOf<String>()
//
//    abstract fun prepare() // 把prepare 宣告成抽象, 原料要改成來自於工廠
//
//    fun bake() = println("Bake for 25 minutes")
//
//    fun cut() = println("Cutting the pizza")
//
//    fun box() = println("Place pizza into box")
//
//}