fun main() {

    var listUsers = HashMap<Int, String>();
    listUsers[12] = "Rafael";
    listUsers[11] = "Rafael 11";

    println(listUsers);
    for (i in 0 until listUsers.size) {
        println("Valor $i");
    }

    for (Key in listUsers.keys) {
        println("Chave $Key VALOR ${listUsers[Key]}");
    }
}