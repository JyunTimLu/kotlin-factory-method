package concrete_product

import PizzaIngredientFactory
import product.Pizza

//class CheesePizza : Pizza() {
//
//    init {
//        name = "Cheese Pizza"
//        name = "Cheese product.Pizza"
//        dough = "dough"
//        sauce = "Marinara Sauce"
//    }
//}

class CheesePizza constructor(val pizzaIngredientFactory: PizzaIngredientFactory) : Pizza() {

    override fun prepare() {
        println("preparing $name")
        dough = pizzaIngredientFactory.createDough()
        sauce = pizzaIngredientFactory.createSauce()
        cheese = pizzaIngredientFactory.createCheese()
        clams = pizzaIngredientFactory.createClam()
    }
}