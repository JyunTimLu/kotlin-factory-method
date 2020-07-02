fun main() {

    val nyPizzaStore = PizzaStore(NYPizzaFactory())

    nyPizzaStore.orderPizza("cheese")

    val chPizzaStore = PizzaStore(ChicagoPizzaFactory())

    chPizzaStore.orderPizza("cheese")

}