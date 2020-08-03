package concrete_product

import product.Pizza

class PepperoniPizza : Pizza() {

    init {
        name = "concrete_product.PepperoniPizza"
        dough = "concrete_product.PepperoniPizza dough..."
        sauce = "concrete_product.PepperoniPizza sauce..."
    }

}