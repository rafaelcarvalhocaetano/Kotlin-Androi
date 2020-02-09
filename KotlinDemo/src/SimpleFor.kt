fun main() {
    println("Valor para o loop");
    val number = readLine()!!.toInt();
    for (i in 1..number) {
        println("Valor de $i");
    }

    println("Pulando pela quantidade");
    val stepNumber = readLine()!!.toInt();
    for (i in 1..number step stepNumber) {
        println("Valor de $i");
    }

    println("Loop do Maior para o Menor sem step");
    val more = readLine()!!.toInt();
    for (i in more downTo 0) {
        println("Valor de $i");
    }

    println("STEP do Loop do Maior para o Menor Com step");
    val stepMore = readLine()!!.toInt();
    for (i in more downTo 0 step stepMore) {
        println("Valor de $i");
    }

    println("Loop com When Valor:::");
    var wl = readLine()!!.toInt();
    while (wl <= 10) {
        println("Contando $wl");
        wl += 1;
    }

    wl = 1;
    do {
        println("Qtd DO $wl");
    } while ( wl <= 10 )
}