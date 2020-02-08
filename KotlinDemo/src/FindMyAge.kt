import java.util.*

fun main() {
    println("Enter your Birth: ");
    val year = readLine()!!.toInt();
    val yearInDevice = Calendar.getInstance().get(Calendar.YEAR);
    val age: Int = yearInDevice - year;

    println("You are $age years old")
}