
fun addNumbers(x: Double, y: Double): Double {
    val temp = x + y;
    println("Valor da soma é $temp");
    return temp;
}

fun displayName(vararg nomes: String) {
    for (nome in nomes) {
        println("Seu Nome é $nome");
    }
}

fun main() {

    println("Insira dois valor para soma: ");
    val numberOne = readLine()!!.toDouble();
    val numberTwo = readLine()!!.toDouble();
    addNumbers(numberOne, numberTwo);

    val data = addNumbers(numberOne, numberTwo);
    println("Valor é $data");

    displayName(nomes = *arrayOf("Rafael", "Rose", "Vitor", "Heitor"));

}