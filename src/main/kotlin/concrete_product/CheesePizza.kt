package concrete_product

import PizzaIngredientFactory
import product.Pizza

class CheesePizza(val pizzaIngredientFactory: PizzaIngredientFactory) : Pizza() {

    override fun prepare() {
        println("preparing $name")
        dough = pizzaIngredientFactory.createDough()
        sauce = pizzaIngredientFactory.createSauce()
        cheese = pizzaIngredientFactory.createCheese()
        clams = pizzaIngredientFactory.createClam()
    }
}