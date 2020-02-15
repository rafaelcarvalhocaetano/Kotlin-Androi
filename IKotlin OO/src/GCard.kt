open class GCard {

    var name: String ?= null;
    var description: String ?= null;

    constructor(name: String?, description: String?) {
        this.name = name
        this.description = description
    }


    open fun boot(data:String): String {
        return data;
    }

    open fun soma(n: Int, nm: Int): Int {
        return n + nm;
    }
}