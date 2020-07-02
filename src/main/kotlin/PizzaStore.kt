
class PizzaStore {

    fun orderPizza(type: String): Pizza {

        var pizza : Pizza

        if (type == "cheese") {
            pizza =  CheesePizza()
        } else if (type == "clam") {
            pizza = ClamPizza()
        } else if (type == "veggiePizza") {
            pizza = VeggiePizza()
        } else {
            throw Exception()
        }

        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()

        return pizza
    }

}