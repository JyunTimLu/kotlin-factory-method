package concrete_product

import product.Pizza

class VeggiePizza : Pizza() {

    init {
        name = "concrete_product.VeggiePizza"
        dough = "concrete_product.VeggiePizza dough"
        sauce = "concrete_product.VeggiePizza Sauce"
    }
}