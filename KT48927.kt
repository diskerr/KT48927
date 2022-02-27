abstract class Base {
    private val _pair = Pair(1, 2)
        get() = field // this is *** required ***


    fun addAndPrint(d: Derived) {
        val p = (d as Base)._pair
        println("${p.first + _pair.first}, ${p.second + _pair.second}")
    }
}

class Derived : Base()

fun main() {
    val d = Derived()
    val n = Derived()

    d.addAndPrint(n)
}
