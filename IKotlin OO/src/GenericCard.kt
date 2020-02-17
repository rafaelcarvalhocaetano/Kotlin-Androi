class GenericCard<T> (card: T) {
    init {
        println("GENERIC CLASS " + card);
    }
}

fun <T> display(process: T) {
    println("Process: "+ process);
}

fun main(args: Array<String>) {
    var card = GenericCard<String>("Rafael");
    var cardNumber = GenericCard<Int>(1123);
    var cardList = GenericCard<List<String>>(listOf("Rafael", "Rose", "Vitor", "Heitor"));

    display<String>("IRAFAEL");

    println(card);
    println(cardNumber);
    println(cardList);

}