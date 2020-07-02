
class PizzaStore(val pizzaFactory: SimpleFactory) {

    fun orderPizza(type: String): Pizza {

        var pizza = pizzaFactory.createPizza(type)

        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()

        return pizza
    }

}