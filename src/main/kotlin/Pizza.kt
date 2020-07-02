abstract class Pizza {

    var name: String = ""
    var dough: String = ""
    var sauce: String = ""
    val toppings = listOf<String>()

    fun prepare() {
        println("Preparing $name")
        println("Tossing dough...")
        println("Adding sauce...")
        toppings.forEach(::println)
    }

    fun bake() = println("Bake for 25 minutes")

    fun cut() = println("Cutting the pizza")

    fun box() = println("Place pizza into box")

}