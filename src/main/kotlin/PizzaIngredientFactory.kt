interface PizzaIngredientFactory {
    fun createDough(): Dough // 麵團
    fun createSauce(): Sauce // 醬料
    fun createCheese(): Cheese // 起司
    fun createVeggies(): List<Veggie> // 蔬菜們
    fun createPepperoni(): Pepperoni // 臘腸
    fun createClam(): Clam // 蛤蠣
}