import concrete_product.CheesePizza
import concrete_product.ClamPizza
import concrete_product.VeggiePizza
import product.Pizza

abstract class SimpleFactory {

    open fun createPizza(type: String): Pizza {

        var pizza : Pizza

        if (type == "cheese") {
            pizza = CheesePizza()
        } else if (type == "clam") {
            pizza = ClamPizza()
        } else if (type == "veggiePizza") {
            pizza = VeggiePizza()
        } else {
            throw Exception()
        }
        return pizza
    }

}