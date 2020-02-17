interface CardInterface {
    fun score(age: Int);
    fun desc(data: String);
}

class CardImplementation: CardInterface {
    override fun score(age: Int) {
        println("Data SCORE");
    }

    override fun desc(data: String) {
        println("Data DESC");
    }

}