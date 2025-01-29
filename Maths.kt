class Maths: MathematicalOperations ,C,E {

    var n1: Int = 10
    var n2: Int = 23
    override fun multiply() {
        super.multiply()
        println("Multiply ${n1 * n2}")
    }

    override fun addition() {
        super.addition()
        println("Addition ${n1 + n2}")
    }

    override fun subtraction() {
        println("Subtraction ${n1 - n2}")
    }

    override fun division() {
        super<C>.division()
        super<E>.division()
        println("Division ${n1 / n2}")

    }
}