package creator

import product.Pizza

abstract class PizzaStore {

    fun orderPizza(type: String): Pizza {

        var pizza = createPizza(type)

        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()

        return pizza
    }

    abstract fun createPizza(type: String): Pizza

}