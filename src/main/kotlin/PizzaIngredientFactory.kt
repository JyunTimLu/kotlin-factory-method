interface PizzaIngredientFactory {
    fun createDough(): Dough
    fun createSauce(): Sauce
    fun createCheese(): Cheese
    fun createVeggies(): List<Veggie>
    fun createPepperoni(): Pepperoni
    fun createClam(): Clam
}