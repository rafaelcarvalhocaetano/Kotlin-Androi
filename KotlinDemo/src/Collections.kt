fun main() {
    println("Pets App");
    val pet1 = readLine()!!.toString();
    val pet2 = readLine()!!.toString();
    val pet3 = readLine()!!.toString();
    val pet4 = readLine()!!.toString();


    val maxSize = 5;
    println("Valor $pet1");
    println("Valor $pet2");
    println("Valor $pet3");
    println("Valor $pet4");

    var listOfPets:Array<String> = Array(maxSize){""};

    for (i in 0 until maxSize) {
        listOfPets[i] = readLine()!!.toString();
    }

    for (i in 0 until maxSize) {
        println("Pet $i : ${listOfPets[i]}");
    }

}