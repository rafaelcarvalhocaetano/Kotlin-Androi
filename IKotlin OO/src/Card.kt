class Card: GCard {

    var data: String;
    var dataCard: String;

    constructor(name: String?, description: String?, data: String, dataCard: String) : super(name, description) {
        this.data = data
        this.dataCard = dataCard
    }


    override fun boot(data: String): String {
        return data;
    }

    override fun soma(n: Int, nm: Int): Int {
        return n + nm;
    }
}