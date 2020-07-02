class NYPizzaFactory: SimpleFactory() {

    override fun createPizza(type: String): Pizza {

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
        return pizza
    }

}