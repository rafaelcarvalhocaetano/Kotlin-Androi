
//fun sum(n: Int, n2: Int): Int {
//    val temp = n + n2;
//    return temp;
//}
// Como Ficaria Lambda
val sum = {numberOne: Int, numberTwo:Int -> numberOne + numberTwo};


fun main() {
    val addNumber = sum(5, 5);
    println(addNumber);

    val listOfNumber = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 99);

    // Normal For
    for (number in listOfNumber) {
        println("Numbers $number");
    }
    // LAMBDA
    listOfNumber.forEach{ x -> println("ForEach $x")}
}