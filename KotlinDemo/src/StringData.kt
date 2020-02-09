fun main() {
    val message = "Fui ali e já volto";

    println(message[0]);
    println(message.toLowerCase());
    println(message.toUpperCase());
    println(message.trim());
    println(message);

    val tokens = message.trim().split(" ");
    for (token in tokens) {
        if (!token.contains("f") || !token.contains("ol")) {
            println("Valor do filtro $token");
        }
        println("Token : $token")
    }

}