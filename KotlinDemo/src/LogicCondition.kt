fun main() {
    println("Enter your age:");
    val age = readLine()!!.toInt();

    if (age in 30..40) {
        println("Metade da Vida");
    }
    if (age < 30) {
        println("Vai curtir porra");
    }

    if (age > 40) {
        println("Fudeeeeu");
    }

    println("When Menu");
    val menu = readLine()!!.toInt();

    when(menu) {
        1 -> {
            println("You got Sandwich");
        }

        10 -> {
            println("You got burger");
        }

        else -> {
            println("Your order");
        }
    }

}