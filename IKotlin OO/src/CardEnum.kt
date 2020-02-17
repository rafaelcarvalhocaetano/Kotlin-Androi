enum class CardEnum {
    A, B, C, D
}

fun main() {
    var alpha = CardEnum.A;

    if (alpha == CardEnum.A) {
        println("ENUM " + alpha);
    }
}